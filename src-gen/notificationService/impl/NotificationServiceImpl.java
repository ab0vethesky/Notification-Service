/**
 */
package notificationService.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import notificationService.MessageClass;
import notificationService.MessagePriority;
import notificationService.NotificationService;
import notificationService.NotificationServicePackage;
import notificationService.NotificationStatus;
import notificationService.QueueingService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getID <em>ID</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getMessageClass <em>Message Class</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getQueueId <em>Queue Id</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getNotificationStatus <em>Notification Status</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getQueueingservice <em>Queueingservice</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getMessagePriority <em>Message Priority</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getNotificationDate <em>Notification Date</em>}</li>
 *   <li>{@link notificationService.impl.NotificationServiceImpl#getMessageRate <em>Message Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationServiceImpl extends MinimalEObjectImpl.Container implements NotificationService {
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
	 * The default value of the '{@link #getSubscriberId() <em>Subscriber Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberId() <em>Subscriber Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberId()
	 * @generated
	 * @ordered
	 */
	protected String subscriberId = SUBSCRIBER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected String messageId = MESSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageClass() <em>Message Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageClass()
	 * @generated
	 * @ordered
	 */
	protected static final MessageClass MESSAGE_CLASS_EDEFAULT = MessageClass.BULK;

	/**
	 * The cached value of the '{@link #getMessageClass() <em>Message Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageClass()
	 * @generated
	 * @ordered
	 */
	protected MessageClass messageClass = MESSAGE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueId() <em>Queue Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueId() <em>Queue Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueId()
	 * @generated
	 * @ordered
	 */
	protected String queueId = QUEUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final char MESSAGE_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected char message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationStatus() <em>Notification Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationStatus NOTIFICATION_STATUS_EDEFAULT = NotificationStatus.SENT;

	/**
	 * The cached value of the '{@link #getNotificationStatus() <em>Notification Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationStatus()
	 * @generated
	 * @ordered
	 */
	protected NotificationStatus notificationStatus = NOTIFICATION_STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getMessagePriority() <em>Message Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePriority()
	 * @generated
	 * @ordered
	 */
	protected static final MessagePriority MESSAGE_PRIORITY_EDEFAULT = MessagePriority.LOW;

	/**
	 * The cached value of the '{@link #getMessagePriority() <em>Message Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePriority()
	 * @generated
	 * @ordered
	 */
	protected MessagePriority messagePriority = MESSAGE_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationDate() <em>Notification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NOTIFICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotificationDate() <em>Notification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationDate()
	 * @generated
	 * @ordered
	 */
	protected Date notificationDate = NOTIFICATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageRate() <em>Message Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRate()
	 * @generated
	 * @ordered
	 */
	protected static final int MESSAGE_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMessageRate() <em>Message Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRate()
	 * @generated
	 * @ordered
	 */
	protected int messageRate = MESSAGE_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotificationServicePackage.Literals.NOTIFICATION_SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.NOTIFICATION_SERVICE__ID,
					oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriberId() {
		return subscriberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriberId(String newSubscriberId) {
		String oldSubscriberId = subscriberId;
		subscriberId = newSubscriberId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__SUBSCRIBER_ID, oldSubscriberId, subscriberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageId() {
		return messageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageId(String newMessageId) {
		String oldMessageId = messageId;
		messageId = newMessageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_ID, oldMessageId, messageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageClass getMessageClass() {
		return messageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageClass(MessageClass newMessageClass) {
		MessageClass oldMessageClass = messageClass;
		messageClass = newMessageClass == null ? MESSAGE_CLASS_EDEFAULT : newMessageClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_CLASS, oldMessageClass, messageClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueueId() {
		return queueId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueId(String newQueueId) {
		String oldQueueId = queueId;
		queueId = newQueueId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__QUEUE_ID, oldQueueId, queueId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(char newMessage) {
		char oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationStatus getNotificationStatus() {
		return notificationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationStatus(NotificationStatus newNotificationStatus) {
		NotificationStatus oldNotificationStatus = notificationStatus;
		notificationStatus = newNotificationStatus == null ? NOTIFICATION_STATUS_EDEFAULT : newNotificationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_STATUS, oldNotificationStatus,
					notificationStatus));
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
							NotificationServicePackage.NOTIFICATION_SERVICE__QUEUEINGSERVICE, oldQueueingservice,
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
	@Override
	public void setQueueingservice(QueueingService newQueueingservice) {
		QueueingService oldQueueingservice = queueingservice;
		queueingservice = newQueueingservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__QUEUEINGSERVICE, oldQueueingservice,
					queueingservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessagePriority getMessagePriority() {
		return messagePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessagePriority(MessagePriority newMessagePriority) {
		MessagePriority oldMessagePriority = messagePriority;
		messagePriority = newMessagePriority == null ? MESSAGE_PRIORITY_EDEFAULT : newMessagePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_PRIORITY, oldMessagePriority,
					messagePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getNotificationDate() {
		return notificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationDate(Date newNotificationDate) {
		Date oldNotificationDate = notificationDate;
		notificationDate = newNotificationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_DATE, oldNotificationDate,
					notificationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMessageRate() {
		return messageRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageRate(int newMessageRate) {
		int oldMessageRate = messageRate;
		messageRate = newMessageRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_RATE, oldMessageRate, messageRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject queueMessage() {
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
		case NotificationServicePackage.NOTIFICATION_SERVICE__ID:
			return getID();
		case NotificationServicePackage.NOTIFICATION_SERVICE__SUBSCRIBER_ID:
			return getSubscriberId();
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_ID:
			return getMessageId();
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_CLASS:
			return getMessageClass();
		case NotificationServicePackage.NOTIFICATION_SERVICE__QUEUE_ID:
			return getQueueId();
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE:
			return getMessage();
		case NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_STATUS:
			return getNotificationStatus();
		case NotificationServicePackage.NOTIFICATION_SERVICE__QUEUEINGSERVICE:
			if (resolve)
				return getQueueingservice();
			return basicGetQueueingservice();
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_PRIORITY:
			return getMessagePriority();
		case NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_DATE:
			return getNotificationDate();
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_RATE:
			return getMessageRate();
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
		case NotificationServicePackage.NOTIFICATION_SERVICE__ID:
			setID((String) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__SUBSCRIBER_ID:
			setSubscriberId((String) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_ID:
			setMessageId((String) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_CLASS:
			setMessageClass((MessageClass) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__QUEUE_ID:
			setQueueId((String) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE:
			setMessage((Character) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_STATUS:
			setNotificationStatus((NotificationStatus) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__QUEUEINGSERVICE:
			setQueueingservice((QueueingService) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_PRIORITY:
			setMessagePriority((MessagePriority) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_DATE:
			setNotificationDate((Date) newValue);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_RATE:
			setMessageRate((Integer) newValue);
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
		case NotificationServicePackage.NOTIFICATION_SERVICE__ID:
			setID(ID_EDEFAULT);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__SUBSCRIBER_ID:
			setSubscriberId(SUBSCRIBER_ID_EDEFAULT);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_ID:
			setMessageId(MESSAGE_ID_EDEFAULT);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_CLASS:
			setMessageClass(MESSAGE_CLASS_EDEFAULT);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__QUEUE_ID:
			setQueueId(QUEUE_ID_EDEFAULT);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_STATUS:
			setNotificationStatus(NOTIFICATION_STATUS_EDEFAULT);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__QUEUEINGSERVICE:
			setQueueingservice((QueueingService) null);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_PRIORITY:
			setMessagePriority(MESSAGE_PRIORITY_EDEFAULT);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_DATE:
			setNotificationDate(NOTIFICATION_DATE_EDEFAULT);
			return;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_RATE:
			setMessageRate(MESSAGE_RATE_EDEFAULT);
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
		case NotificationServicePackage.NOTIFICATION_SERVICE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case NotificationServicePackage.NOTIFICATION_SERVICE__SUBSCRIBER_ID:
			return SUBSCRIBER_ID_EDEFAULT == null ? subscriberId != null : !SUBSCRIBER_ID_EDEFAULT.equals(subscriberId);
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_ID:
			return MESSAGE_ID_EDEFAULT == null ? messageId != null : !MESSAGE_ID_EDEFAULT.equals(messageId);
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_CLASS:
			return messageClass != MESSAGE_CLASS_EDEFAULT;
		case NotificationServicePackage.NOTIFICATION_SERVICE__QUEUE_ID:
			return QUEUE_ID_EDEFAULT == null ? queueId != null : !QUEUE_ID_EDEFAULT.equals(queueId);
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE:
			return message != MESSAGE_EDEFAULT;
		case NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_STATUS:
			return notificationStatus != NOTIFICATION_STATUS_EDEFAULT;
		case NotificationServicePackage.NOTIFICATION_SERVICE__QUEUEINGSERVICE:
			return queueingservice != null;
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_PRIORITY:
			return messagePriority != MESSAGE_PRIORITY_EDEFAULT;
		case NotificationServicePackage.NOTIFICATION_SERVICE__NOTIFICATION_DATE:
			return NOTIFICATION_DATE_EDEFAULT == null ? notificationDate != null
					: !NOTIFICATION_DATE_EDEFAULT.equals(notificationDate);
		case NotificationServicePackage.NOTIFICATION_SERVICE__MESSAGE_RATE:
			return messageRate != MESSAGE_RATE_EDEFAULT;
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
		case NotificationServicePackage.NOTIFICATION_SERVICE___QUEUE_MESSAGE:
			return queueMessage();
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
		result.append(", subscriberId: ");
		result.append(subscriberId);
		result.append(", messageId: ");
		result.append(messageId);
		result.append(", messageClass: ");
		result.append(messageClass);
		result.append(", queueId: ");
		result.append(queueId);
		result.append(", message: ");
		result.append(message);
		result.append(", notificationStatus: ");
		result.append(notificationStatus);
		result.append(", messagePriority: ");
		result.append(messagePriority);
		result.append(", notificationDate: ");
		result.append(notificationDate);
		result.append(", messageRate: ");
		result.append(messageRate);
		result.append(')');
		return result.toString();
	}

} //NotificationServiceImpl
