/**
 */
package notificationService.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import notificationService.MessageClass;
import notificationService.MessagePriority;
import notificationService.NotificationServicePackage;
import notificationService.Prioritizer;
import notificationService.Publisher;
import notificationService.QueueingService;
import notificationService.RateLimiter;
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
 * An implementation of the model object '<em><b>Queueing Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getID <em>ID</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getDateTimeQueued <em>Date Time Queued</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getDateSent <em>Date Sent</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getMessagePriority <em>Message Priority</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getMessageClass <em>Message Class</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getThrottlingservice <em>Throttlingservice</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getRatelimiter <em>Ratelimiter</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getPrioritizer <em>Prioritizer</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getBatchNumber <em>Batch Number</em>}</li>
 *   <li>{@link notificationService.impl.QueueingServiceImpl#getMessageRate <em>Message Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueingServiceImpl extends MinimalEObjectImpl.Container implements QueueingService {
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
	 * The default value of the '{@link #getDateTimeQueued() <em>Date Time Queued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeQueued()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_QUEUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTimeQueued() <em>Date Time Queued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeQueued()
	 * @generated
	 * @ordered
	 */
	protected Date dateTimeQueued = DATE_TIME_QUEUED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateSent() <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSent()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateSent() <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSent()
	 * @generated
	 * @ordered
	 */
	protected Date dateSent = DATE_SENT_EDEFAULT;

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
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Publisher publisher;

	/**
	 * The cached value of the '{@link #getThrottlingservice() <em>Throttlingservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrottlingservice()
	 * @generated
	 * @ordered
	 */
	protected ThrottlingService throttlingservice;

	/**
	 * The cached value of the '{@link #getRatelimiter() <em>Ratelimiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatelimiter()
	 * @generated
	 * @ordered
	 */
	protected RateLimiter ratelimiter;

	/**
	 * The cached value of the '{@link #getPrioritizer() <em>Prioritizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritizer()
	 * @generated
	 * @ordered
	 */
	protected Prioritizer prioritizer;

	/**
	 * The default value of the '{@link #getBatchNumber() <em>Batch Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchNumber()
	 * @generated
	 * @ordered
	 */
	protected static final char BATCH_NUMBER_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getBatchNumber() <em>Batch Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchNumber()
	 * @generated
	 * @ordered
	 */
	protected char batchNumber = BATCH_NUMBER_EDEFAULT;

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
	protected QueueingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotificationServicePackage.Literals.QUEUEING_SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.QUEUEING_SERVICE__ID,
					oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NotificationServicePackage.QUEUEING_SERVICE__MESSAGE,
					oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateTimeQueued() {
		return dateTimeQueued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTimeQueued(Date newDateTimeQueued) {
		Date oldDateTimeQueued = dateTimeQueued;
		dateTimeQueued = newDateTimeQueued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__DATE_TIME_QUEUED, oldDateTimeQueued, dateTimeQueued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateSent() {
		return dateSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateSent(Date newDateSent) {
		Date oldDateSent = dateSent;
		dateSent = newDateSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__DATE_SENT, oldDateSent, dateSent));
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
					NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_PRIORITY, oldMessagePriority,
					messagePriority));
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
					NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_CLASS, oldMessageClass, messageClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publisher getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject) publisher;
			publisher = (Publisher) eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NotificationServicePackage.QUEUEING_SERVICE__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(Publisher newPublisher) {
		Publisher oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrottlingService getThrottlingservice() {
		if (throttlingservice != null && throttlingservice.eIsProxy()) {
			InternalEObject oldThrottlingservice = (InternalEObject) throttlingservice;
			throttlingservice = (ThrottlingService) eResolveProxy(oldThrottlingservice);
			if (throttlingservice != oldThrottlingservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE, oldThrottlingservice,
							throttlingservice));
			}
		}
		return throttlingservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrottlingService basicGetThrottlingservice() {
		return throttlingservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrottlingservice(ThrottlingService newThrottlingservice, NotificationChain msgs) {
		ThrottlingService oldThrottlingservice = throttlingservice;
		throttlingservice = newThrottlingservice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE, oldThrottlingservice,
					newThrottlingservice);
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
	public void setThrottlingservice(ThrottlingService newThrottlingservice) {
		if (newThrottlingservice != throttlingservice) {
			NotificationChain msgs = null;
			if (throttlingservice != null)
				msgs = ((InternalEObject) throttlingservice).eInverseRemove(this,
						NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE, ThrottlingService.class, msgs);
			if (newThrottlingservice != null)
				msgs = ((InternalEObject) newThrottlingservice).eInverseAdd(this,
						NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE, ThrottlingService.class, msgs);
			msgs = basicSetThrottlingservice(newThrottlingservice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE, newThrottlingservice,
					newThrottlingservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RateLimiter getRatelimiter() {
		if (ratelimiter != null && ratelimiter.eIsProxy()) {
			InternalEObject oldRatelimiter = (InternalEObject) ratelimiter;
			ratelimiter = (RateLimiter) eResolveProxy(oldRatelimiter);
			if (ratelimiter != oldRatelimiter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NotificationServicePackage.QUEUEING_SERVICE__RATELIMITER, oldRatelimiter, ratelimiter));
			}
		}
		return ratelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateLimiter basicGetRatelimiter() {
		return ratelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatelimiter(RateLimiter newRatelimiter, NotificationChain msgs) {
		RateLimiter oldRatelimiter = ratelimiter;
		ratelimiter = newRatelimiter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__RATELIMITER, oldRatelimiter, newRatelimiter);
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
	public void setRatelimiter(RateLimiter newRatelimiter) {
		if (newRatelimiter != ratelimiter) {
			NotificationChain msgs = null;
			if (ratelimiter != null)
				msgs = ((InternalEObject) ratelimiter).eInverseRemove(this,
						NotificationServicePackage.RATE_LIMITER__QUEUEINGSERVICE, RateLimiter.class, msgs);
			if (newRatelimiter != null)
				msgs = ((InternalEObject) newRatelimiter).eInverseAdd(this,
						NotificationServicePackage.RATE_LIMITER__QUEUEINGSERVICE, RateLimiter.class, msgs);
			msgs = basicSetRatelimiter(newRatelimiter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__RATELIMITER, newRatelimiter, newRatelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritizer getPrioritizer() {
		if (prioritizer != null && prioritizer.eIsProxy()) {
			InternalEObject oldPrioritizer = (InternalEObject) prioritizer;
			prioritizer = (Prioritizer) eResolveProxy(oldPrioritizer);
			if (prioritizer != oldPrioritizer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NotificationServicePackage.QUEUEING_SERVICE__PRIORITIZER, oldPrioritizer, prioritizer));
			}
		}
		return prioritizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prioritizer basicGetPrioritizer() {
		return prioritizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrioritizer(Prioritizer newPrioritizer, NotificationChain msgs) {
		Prioritizer oldPrioritizer = prioritizer;
		prioritizer = newPrioritizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__PRIORITIZER, oldPrioritizer, newPrioritizer);
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
	public void setPrioritizer(Prioritizer newPrioritizer) {
		if (newPrioritizer != prioritizer) {
			NotificationChain msgs = null;
			if (prioritizer != null)
				msgs = ((InternalEObject) prioritizer).eInverseRemove(this,
						NotificationServicePackage.PRIORITIZER__QUEUEINGSERVICE, Prioritizer.class, msgs);
			if (newPrioritizer != null)
				msgs = ((InternalEObject) newPrioritizer).eInverseAdd(this,
						NotificationServicePackage.PRIORITIZER__QUEUEINGSERVICE, Prioritizer.class, msgs);
			msgs = basicSetPrioritizer(newPrioritizer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__PRIORITIZER, newPrioritizer, newPrioritizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public char getBatchNumber() {
		return batchNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatchNumber(char newBatchNumber) {
		char oldBatchNumber = batchNumber;
		batchNumber = newBatchNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NotificationServicePackage.QUEUEING_SERVICE__BATCH_NUMBER, oldBatchNumber, batchNumber));
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
					NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_RATE, oldMessageRate, messageRate));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE:
			if (throttlingservice != null)
				msgs = ((InternalEObject) throttlingservice).eInverseRemove(this,
						NotificationServicePackage.THROTTLING_SERVICE__QUEUEINGSERVICE, ThrottlingService.class, msgs);
			return basicSetThrottlingservice((ThrottlingService) otherEnd, msgs);
		case NotificationServicePackage.QUEUEING_SERVICE__RATELIMITER:
			if (ratelimiter != null)
				msgs = ((InternalEObject) ratelimiter).eInverseRemove(this,
						NotificationServicePackage.RATE_LIMITER__QUEUEINGSERVICE, RateLimiter.class, msgs);
			return basicSetRatelimiter((RateLimiter) otherEnd, msgs);
		case NotificationServicePackage.QUEUEING_SERVICE__PRIORITIZER:
			if (prioritizer != null)
				msgs = ((InternalEObject) prioritizer).eInverseRemove(this,
						NotificationServicePackage.PRIORITIZER__QUEUEINGSERVICE, Prioritizer.class, msgs);
			return basicSetPrioritizer((Prioritizer) otherEnd, msgs);
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
		case NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE:
			return basicSetThrottlingservice(null, msgs);
		case NotificationServicePackage.QUEUEING_SERVICE__RATELIMITER:
			return basicSetRatelimiter(null, msgs);
		case NotificationServicePackage.QUEUEING_SERVICE__PRIORITIZER:
			return basicSetPrioritizer(null, msgs);
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
		case NotificationServicePackage.QUEUEING_SERVICE__ID:
			return getID();
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE:
			return getMessage();
		case NotificationServicePackage.QUEUEING_SERVICE__DATE_TIME_QUEUED:
			return getDateTimeQueued();
		case NotificationServicePackage.QUEUEING_SERVICE__DATE_SENT:
			return getDateSent();
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_PRIORITY:
			return getMessagePriority();
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_CLASS:
			return getMessageClass();
		case NotificationServicePackage.QUEUEING_SERVICE__PUBLISHER:
			if (resolve)
				return getPublisher();
			return basicGetPublisher();
		case NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE:
			if (resolve)
				return getThrottlingservice();
			return basicGetThrottlingservice();
		case NotificationServicePackage.QUEUEING_SERVICE__RATELIMITER:
			if (resolve)
				return getRatelimiter();
			return basicGetRatelimiter();
		case NotificationServicePackage.QUEUEING_SERVICE__PRIORITIZER:
			if (resolve)
				return getPrioritizer();
			return basicGetPrioritizer();
		case NotificationServicePackage.QUEUEING_SERVICE__BATCH_NUMBER:
			return getBatchNumber();
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_RATE:
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
		case NotificationServicePackage.QUEUEING_SERVICE__ID:
			setID((String) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE:
			setMessage((Character) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__DATE_TIME_QUEUED:
			setDateTimeQueued((Date) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__DATE_SENT:
			setDateSent((Date) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_PRIORITY:
			setMessagePriority((MessagePriority) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_CLASS:
			setMessageClass((MessageClass) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__PUBLISHER:
			setPublisher((Publisher) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE:
			setThrottlingservice((ThrottlingService) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__RATELIMITER:
			setRatelimiter((RateLimiter) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__PRIORITIZER:
			setPrioritizer((Prioritizer) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__BATCH_NUMBER:
			setBatchNumber((Character) newValue);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_RATE:
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
		case NotificationServicePackage.QUEUEING_SERVICE__ID:
			setID(ID_EDEFAULT);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__DATE_TIME_QUEUED:
			setDateTimeQueued(DATE_TIME_QUEUED_EDEFAULT);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__DATE_SENT:
			setDateSent(DATE_SENT_EDEFAULT);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_PRIORITY:
			setMessagePriority(MESSAGE_PRIORITY_EDEFAULT);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_CLASS:
			setMessageClass(MESSAGE_CLASS_EDEFAULT);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__PUBLISHER:
			setPublisher((Publisher) null);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE:
			setThrottlingservice((ThrottlingService) null);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__RATELIMITER:
			setRatelimiter((RateLimiter) null);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__PRIORITIZER:
			setPrioritizer((Prioritizer) null);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__BATCH_NUMBER:
			setBatchNumber(BATCH_NUMBER_EDEFAULT);
			return;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_RATE:
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
		case NotificationServicePackage.QUEUEING_SERVICE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE:
			return message != MESSAGE_EDEFAULT;
		case NotificationServicePackage.QUEUEING_SERVICE__DATE_TIME_QUEUED:
			return DATE_TIME_QUEUED_EDEFAULT == null ? dateTimeQueued != null
					: !DATE_TIME_QUEUED_EDEFAULT.equals(dateTimeQueued);
		case NotificationServicePackage.QUEUEING_SERVICE__DATE_SENT:
			return DATE_SENT_EDEFAULT == null ? dateSent != null : !DATE_SENT_EDEFAULT.equals(dateSent);
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_PRIORITY:
			return messagePriority != MESSAGE_PRIORITY_EDEFAULT;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_CLASS:
			return messageClass != MESSAGE_CLASS_EDEFAULT;
		case NotificationServicePackage.QUEUEING_SERVICE__PUBLISHER:
			return publisher != null;
		case NotificationServicePackage.QUEUEING_SERVICE__THROTTLINGSERVICE:
			return throttlingservice != null;
		case NotificationServicePackage.QUEUEING_SERVICE__RATELIMITER:
			return ratelimiter != null;
		case NotificationServicePackage.QUEUEING_SERVICE__PRIORITIZER:
			return prioritizer != null;
		case NotificationServicePackage.QUEUEING_SERVICE__BATCH_NUMBER:
			return batchNumber != BATCH_NUMBER_EDEFAULT;
		case NotificationServicePackage.QUEUEING_SERVICE__MESSAGE_RATE:
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
		case NotificationServicePackage.QUEUEING_SERVICE___PUBLISH_MESSAGE:
			publishMessage();
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
		result.append(", message: ");
		result.append(message);
		result.append(", dateTimeQueued: ");
		result.append(dateTimeQueued);
		result.append(", dateSent: ");
		result.append(dateSent);
		result.append(", messagePriority: ");
		result.append(messagePriority);
		result.append(", messageClass: ");
		result.append(messageClass);
		result.append(", batchNumber: ");
		result.append(batchNumber);
		result.append(", messageRate: ");
		result.append(messageRate);
		result.append(')');
		return result.toString();
	}

} //QueueingServiceImpl
