/**
 */
package notificationService.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import notificationService.NotificationService;
import notificationService.NotificationServicePackage;
import notificationService.Publisher;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notificationService.impl.PublisherImpl#getID <em>ID</em>}</li>
 *   <li>{@link notificationService.impl.PublisherImpl#getDateReceived <em>Date Received</em>}</li>
 *   <li>{@link notificationService.impl.PublisherImpl#getDatePublished <em>Date Published</em>}</li>
 *   <li>{@link notificationService.impl.PublisherImpl#getNotificationservice <em>Notificationservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublisherImpl extends MinimalEObjectImpl.Container implements Publisher {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateReceived() <em>Date Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateReceived() <em>Date Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateReceived()
	 * @generated
	 * @ordered
	 */
	protected Date dateReceived = DATE_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatePublished() <em>Date Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePublished()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_PUBLISHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatePublished() <em>Date Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePublished()
	 * @generated
	 * @ordered
	 */
	protected Date datePublished = DATE_PUBLISHED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotificationservice() <em>Notificationservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationservice()
	 * @generated
	 * @ordered
	 */
	protected NotificationService notificationservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotificationServicePackage.Literals.PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.PUBLISHER__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateReceived() {
		return dateReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateReceived(Date newDateReceived) {
		Date oldDateReceived = dateReceived;
		dateReceived = newDateReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.PUBLISHER__DATE_RECEIVED,
					oldDateReceived, dateReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatePublished() {
		return datePublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatePublished(Date newDatePublished) {
		Date oldDatePublished = datePublished;
		datePublished = newDatePublished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.PUBLISHER__DATE_PUBLISHED,
					oldDatePublished, datePublished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationService getNotificationservice() {
		if (notificationservice != null && notificationservice.eIsProxy()) {
			InternalEObject oldNotificationservice = (InternalEObject) notificationservice;
			notificationservice = (NotificationService) eResolveProxy(oldNotificationservice);
			if (notificationservice != oldNotificationservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NotificationServicePackage.PUBLISHER__NOTIFICATIONSERVICE, oldNotificationservice,
							notificationservice));
			}
		}
		return notificationservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationService basicGetNotificationservice() {
		return notificationservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationservice(NotificationService newNotificationservice) {
		NotificationService oldNotificationservice = notificationservice;
		notificationservice = newNotificationservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.PUBLISHER__NOTIFICATIONSERVICE, oldNotificationservice,
					notificationservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void publishMessage() {
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
	public void updateStatus() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotificationServicePackage.PUBLISHER__ID:
			return getID();
		case NotificationServicePackage.PUBLISHER__DATE_RECEIVED:
			return getDateReceived();
		case NotificationServicePackage.PUBLISHER__DATE_PUBLISHED:
			return getDatePublished();
		case NotificationServicePackage.PUBLISHER__NOTIFICATIONSERVICE:
			if (resolve)
				return getNotificationservice();
			return basicGetNotificationservice();
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
		case NotificationServicePackage.PUBLISHER__ID:
			setID((String) newValue);
			return;
		case NotificationServicePackage.PUBLISHER__DATE_RECEIVED:
			setDateReceived((Date) newValue);
			return;
		case NotificationServicePackage.PUBLISHER__DATE_PUBLISHED:
			setDatePublished((Date) newValue);
			return;
		case NotificationServicePackage.PUBLISHER__NOTIFICATIONSERVICE:
			setNotificationservice((NotificationService) newValue);
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
		case NotificationServicePackage.PUBLISHER__ID:
			setID(ID_EDEFAULT);
			return;
		case NotificationServicePackage.PUBLISHER__DATE_RECEIVED:
			setDateReceived(DATE_RECEIVED_EDEFAULT);
			return;
		case NotificationServicePackage.PUBLISHER__DATE_PUBLISHED:
			setDatePublished(DATE_PUBLISHED_EDEFAULT);
			return;
		case NotificationServicePackage.PUBLISHER__NOTIFICATIONSERVICE:
			setNotificationservice((NotificationService) null);
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
		case NotificationServicePackage.PUBLISHER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case NotificationServicePackage.PUBLISHER__DATE_RECEIVED:
			return DATE_RECEIVED_EDEFAULT == null ? dateReceived != null : !DATE_RECEIVED_EDEFAULT.equals(dateReceived);
		case NotificationServicePackage.PUBLISHER__DATE_PUBLISHED:
			return DATE_PUBLISHED_EDEFAULT == null ? datePublished != null
					: !DATE_PUBLISHED_EDEFAULT.equals(datePublished);
		case NotificationServicePackage.PUBLISHER__NOTIFICATIONSERVICE:
			return notificationservice != null;
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
		case NotificationServicePackage.PUBLISHER___PUBLISH_MESSAGE:
			publishMessage();
			return null;
		case NotificationServicePackage.PUBLISHER___UPDATE_STATUS:
			updateStatus();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", dateReceived: ");
		result.append(dateReceived);
		result.append(", datePublished: ");
		result.append(datePublished);
		result.append(')');
		return result.toString();
	}

} //PublisherImpl
