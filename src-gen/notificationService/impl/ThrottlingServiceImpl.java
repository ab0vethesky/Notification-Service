/**
 */
package notificationService.impl;

import java.lang.reflect.InvocationTargetException;

import notificationService.NotificationServicePackage;
import notificationService.QueueingService;
import notificationService.ThrottlingService;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throttling Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notificationService.impl.ThrottlingServiceImpl#getQueueingservice <em>Queueingservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThrottlingServiceImpl extends MinimalEObjectImpl.Container implements ThrottlingService {
	/**
	 * The cached value of the '{@link #getQueueingservice() <em>Queueingservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueingservice()
	 * @generated
	 * @ordered
	 */
	protected QueueingService queueingservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrottlingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotificationServicePackage.Literals.THROTTLING_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueingService getQueueingservice() {
		if (queueingservice != null && queueingservice.eIsProxy()) {
			InternalEObject oldQueueingservice = (InternalEObject) queueingservice;
			queueingservice = (QueueingService) eResolveProxy(oldQueueingservice);
			if (queueingservice != oldQueueingservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE, oldQueueingservice,
							queueingservice));
			}
		}
		return queueingservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueingService basicGetQueueingservice() {
		return queueingservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueueingservice(QueueingService newQueueingservice, NotificationChain msgs) {
		QueueingService oldQueueingservice = queueingservice;
		queueingservice = newQueueingservice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE, oldQueueingservice,
					newQueueingservice);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueingservice(QueueingService newQueueingservice) {
		if (newQueueingservice != queueingservice) {
			NotificationChain msgs = null;
			if (queueingservice != null)
				msgs = ((InternalEObject) queueingservice).eInverseRemove(this,
						NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE, QueueingService.class, msgs);
			if (newQueueingservice != null)
				msgs = ((InternalEObject) newQueueingservice).eInverseAdd(this,
						NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE, QueueingService.class, msgs);
			msgs = basicSetQueueingservice(newQueueingservice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE, newQueueingservice,
					newQueueingservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void scheduleMessage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE:
			if (queueingservice != null)
				msgs = ((InternalEObject) queueingservice).eInverseRemove(this,
						NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE, QueueingService.class, msgs);
			return basicSetQueueingservice((QueueingService) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE:
			return basicSetQueueingservice(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE:
			if (resolve)
				return getQueueingservice();
			return basicGetQueueingservice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE:
			setQueueingservice((QueueingService) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE:
			setQueueingservice((QueueingService) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE:
			return queueingservice != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case NotificationServicePackage.THROTTLING_SERVICE___SCHEDULE_MESSAGE:
			scheduleMessage();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ThrottlingServiceImpl
