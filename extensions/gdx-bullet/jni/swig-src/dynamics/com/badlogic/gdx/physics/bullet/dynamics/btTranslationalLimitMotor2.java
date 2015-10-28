/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTranslationalLimitMotor2 extends BulletBase {
	private long swigCPtr;
	
	protected btTranslationalLimitMotor2(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTranslationalLimitMotor2, normally you should not need this constructor it's intended for low-level usage. */ 
	public btTranslationalLimitMotor2(long cPtr, boolean cMemoryOwn) {
		this("btTranslationalLimitMotor2", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTranslationalLimitMotor2 obj) {
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
				DynamicsJNI.delete_btTranslationalLimitMotor2(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setLowerLimit(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_lowerLimit_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getLowerLimit() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_lowerLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setUpperLimit(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_upperLimit_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getUpperLimit() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_upperLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setBounce(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_bounce_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getBounce() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_bounce_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setStopERP(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_stopERP_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getStopERP() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_stopERP_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setStopCFM(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_stopCFM_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getStopCFM() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_stopCFM_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setMotorERP(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_motorERP_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMotorERP() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_motorERP_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setMotorCFM(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_motorCFM_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMotorCFM() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_motorCFM_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setEnableMotor(boolean[] value) {
    DynamicsJNI.btTranslationalLimitMotor2_enableMotor_set(swigCPtr, this, value);
  }

  public boolean[] getEnableMotor() {
    return DynamicsJNI.btTranslationalLimitMotor2_enableMotor_get(swigCPtr, this);
}

  public void setServoMotor(boolean[] value) {
    DynamicsJNI.btTranslationalLimitMotor2_servoMotor_set(swigCPtr, this, value);
  }

  public boolean[] getServoMotor() {
    return DynamicsJNI.btTranslationalLimitMotor2_servoMotor_get(swigCPtr, this);
}

  public void setEnableSpring(boolean[] value) {
    DynamicsJNI.btTranslationalLimitMotor2_enableSpring_set(swigCPtr, this, value);
  }

  public boolean[] getEnableSpring() {
    return DynamicsJNI.btTranslationalLimitMotor2_enableSpring_get(swigCPtr, this);
}

  public void setServoTarget(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_servoTarget_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getServoTarget() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_servoTarget_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setSpringStiffness(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_springStiffness_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getSpringStiffness() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_springStiffness_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setSpringStiffnessLimited(boolean[] value) {
    DynamicsJNI.btTranslationalLimitMotor2_springStiffnessLimited_set(swigCPtr, this, value);
  }

  public boolean[] getSpringStiffnessLimited() {
    return DynamicsJNI.btTranslationalLimitMotor2_springStiffnessLimited_get(swigCPtr, this);
}

  public void setSpringDamping(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_springDamping_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getSpringDamping() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_springDamping_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setSpringDampingLimited(boolean[] value) {
    DynamicsJNI.btTranslationalLimitMotor2_springDampingLimited_set(swigCPtr, this, value);
  }

  public boolean[] getSpringDampingLimited() {
    return DynamicsJNI.btTranslationalLimitMotor2_springDampingLimited_get(swigCPtr, this);
}

  public void setEquilibriumPoint(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_equilibriumPoint_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getEquilibriumPoint() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_equilibriumPoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setTargetVelocity(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_targetVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getTargetVelocity() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_targetVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setMaxMotorForce(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_maxMotorForce_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMaxMotorForce() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_maxMotorForce_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCurrentLimitError(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_currentLimitError_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getCurrentLimitError() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_currentLimitError_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCurrentLimitErrorHi(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_currentLimitErrorHi_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getCurrentLimitErrorHi() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_currentLimitErrorHi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCurrentLinearDiff(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_currentLinearDiff_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getCurrentLinearDiff() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor2_currentLinearDiff_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setCurrentLimit(int[] value) {
    DynamicsJNI.btTranslationalLimitMotor2_currentLimit_set(swigCPtr, this, value);
  }

  public int[] getCurrentLimit() {
    return DynamicsJNI.btTranslationalLimitMotor2_currentLimit_get(swigCPtr, this);
}

  public btTranslationalLimitMotor2() {
    this(DynamicsJNI.new_btTranslationalLimitMotor2__SWIG_0(), true);
  }

  public btTranslationalLimitMotor2(btTranslationalLimitMotor2 other) {
    this(DynamicsJNI.new_btTranslationalLimitMotor2__SWIG_1(btTranslationalLimitMotor2.getCPtr(other), other), true);
  }

  public boolean isLimited(int limitIndex) {
    return DynamicsJNI.btTranslationalLimitMotor2_isLimited(swigCPtr, this, limitIndex);
  }

  public void testLimitValue(int limitIndex, float test_value) {
    DynamicsJNI.btTranslationalLimitMotor2_testLimitValue(swigCPtr, this, limitIndex, test_value);
  }

}
