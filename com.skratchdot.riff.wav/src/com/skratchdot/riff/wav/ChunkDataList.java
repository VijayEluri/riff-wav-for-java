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
package com.skratchdot.riff.wav;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Data List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataList#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkDataList#getDataListChunks <em>Data List Chunks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataList()
 * @model
 * @generated
 */
public interface ChunkDataList extends Chunk {
	/**
	 * Returns the value of the '<em><b>Type ID</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.riff.wav.ChunkDataListTypeID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type ID</em>' attribute.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeID
	 * @see #setTypeID(ChunkDataListTypeID)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataList_TypeID()
	 * @model
	 * @generated
	 */
	ChunkDataListTypeID getTypeID();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataList#getTypeID <em>Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type ID</em>' attribute.
	 * @see com.skratchdot.riff.wav.ChunkDataListTypeID
	 * @see #getTypeID()
	 * @generated
	 */
	void setTypeID(ChunkDataListTypeID value);

	/**
	 * Returns the value of the '<em><b>Data List Chunks</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data List Chunks</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data List Chunks</em>' reference.
	 * @see #setDataListChunks(ChunkDataListType)
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkDataList_DataListChunks()
	 * @model
	 * @generated
	 */
	ChunkDataListType getDataListChunks();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkDataList#getDataListChunks <em>Data List Chunks</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data List Chunks</em>' reference.
	 * @see #getDataListChunks()
	 * @generated
	 */
	void setDataListChunks(ChunkDataListType value);

} // ChunkDataList
