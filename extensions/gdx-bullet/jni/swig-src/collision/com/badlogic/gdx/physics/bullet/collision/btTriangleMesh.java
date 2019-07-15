/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTriangleMesh extends btTriangleIndexVertexArray {
	private long swigCPtr;
	
	protected btTriangleMesh(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btTriangleMesh_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriangleMesh, normally you should not need this constructor it's intended for low-level usage. */
	public btTriangleMesh(long cPtr, boolean cMemoryOwn) {
		this("btTriangleMesh", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btTriangleMesh_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleMesh obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btTriangleMesh(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setWeldingThreshold(float value) {
    CollisionJNI.btTriangleMesh_weldingThreshold_set(swigCPtr, this, value);
  }

  public float getWeldingThreshold() {
    return CollisionJNI.btTriangleMesh_weldingThreshold_get(swigCPtr, this);
  }

  public btTriangleMesh(boolean use32bitIndices, boolean use4componentVertices) {
    this(CollisionJNI.new_btTriangleMesh__SWIG_0(use32bitIndices, use4componentVertices), true);
  }

  public btTriangleMesh(boolean use32bitIndices) {
    this(CollisionJNI.new_btTriangleMesh__SWIG_1(use32bitIndices), true);
  }

  public btTriangleMesh() {
    this(CollisionJNI.new_btTriangleMesh__SWIG_2(), true);
  }

  public boolean getUse32bitIndices() {
    return CollisionJNI.btTriangleMesh_getUse32bitIndices(swigCPtr, this);
  }

  public boolean getUse4componentVertices() {
    return CollisionJNI.btTriangleMesh_getUse4componentVertices(swigCPtr, this);
  }

  public void addTriangle(Vector3 vertex0, Vector3 vertex1, Vector3 vertex2, boolean removeDuplicateVertices) {
    CollisionJNI.btTriangleMesh_addTriangle__SWIG_0(swigCPtr, this, vertex0, vertex1, vertex2, removeDuplicateVertices);
  }

  public void addTriangle(Vector3 vertex0, Vector3 vertex1, Vector3 vertex2) {
    CollisionJNI.btTriangleMesh_addTriangle__SWIG_1(swigCPtr, this, vertex0, vertex1, vertex2);
  }

  public void addTriangleIndices(int index1, int index2, int index3) {
    CollisionJNI.btTriangleMesh_addTriangleIndices(swigCPtr, this, index1, index2, index3);
  }

  public int getNumTriangles() {
    return CollisionJNI.btTriangleMesh_getNumTriangles(swigCPtr, this);
  }

  public int findOrAddVertex(Vector3 vertex, boolean removeDuplicateVertices) {
    return CollisionJNI.btTriangleMesh_findOrAddVertex(swigCPtr, this, vertex, removeDuplicateVertices);
  }

  public void addIndex(int index) {
    CollisionJNI.btTriangleMesh_addIndex(swigCPtr, this, index);
  }

}
