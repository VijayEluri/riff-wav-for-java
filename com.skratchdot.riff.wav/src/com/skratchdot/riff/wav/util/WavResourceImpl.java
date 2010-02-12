/**
 * Copyright (c) 2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial modeling finished using information provided by:
 * 	http://www.sonicspot.com/guide/wavefiles.html
 * 
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.riff.wav.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.skratchdot.riff.wav.RIFFWave;
import com.skratchdot.riff.wav.WavFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see com.skratchdot.riff.wav.util.WavResourceFactoryImpl
 * @generated
 */
public class WavResourceImpl extends ResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public WavResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		inputStream.close();
		if(options!=null && options.containsKey("FileString")) {
			try {
				String fileString = (String) options.get("FileString");
				RIFFWave riffWave = WavFactory.eINSTANCE.createRIFFWave(new File(fileString));
				this.getContents().add(riffWave);		
			} catch (RiffWaveException e) {
				e.printStackTrace();
				throw new IOException(e.getMessage());
			}
		}
		else {
			throw new IOException("Did not pass in the FileString LoadOption.\n" +
					"This implementation of doLoad() ignores the inputStream, and requires\n" +
					"the FileString LoadOption which points to a valid File.");
		}
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		// TODO Auto-generated method stub
		super.doSave(outputStream, options);
	}

} //WavResourceImpl
