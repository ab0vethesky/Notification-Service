/**
 */
package notificationService.impl;

import notificationService.MessageClass;
import notificationService.MessagePriority;
import notificationService.NotificationService;
import notificationService.NotificationServiceFactory;
import notificationService.NotificationServicePackage;
import notificationService.NotificationStatus;
import notificationService.Prioritizer;
import notificationService.Publisher;
import notificationService.QueueingService;
import notificationService.RateLimiter;
import notificationService.ThrottlingService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotificationServicePackageImpl extends EPackageImpl implements NotificationServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueingServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throttlingServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateLimiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messagePriorityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see notificationService.NotificationServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NotificationServicePackageImpl() {
		super(eNS_URI, NotificationServiceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NotificationServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NotificationServicePackage init() {
		if (isInited)
			return (NotificationServicePackage) EPackage.Registry.INSTANCE
					.getEPackage(NotificationServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNotificationServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NotificationServicePackageImpl theNotificationServicePackage = registeredNotificationServicePackage instanceof NotificationServicePackageImpl
				? (NotificationServicePackageImpl) registeredNotificationServicePackage
				: new NotificationServicePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theNotificationServicePackage.createPackageContents();

		// Initialize created meta-data
		theNotificationServicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNotificationServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NotificationServicePackage.eNS_URI, theNotificationServicePackage);
		return theNotificationServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotificationService() {
		return notificationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_ID() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_SubscriberId() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_MessageId() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_MessageClass() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_QueueId() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_Message() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_NotificationStatus() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotificationService_Queueingservice() {
		return (EReference) notificationServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_MessagePriority() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_NotificationDate() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotificationService_MessageRate() {
		return (EAttribute) notificationServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNotificationService__QueueMessage() {
		return notificationServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueueingService() {
		return queueingServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueingService_ID() {
		return (EAttribute) queueingServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueingService_Message() {
		return (EAttribute) queueingServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueingService_DateTimeQueued() {
		return (EAttribute) queueingServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueingService_DateSent() {
		return (EAttribute) queueingServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueingService_MessagePriority() {
		return (EAttribute) queueingServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueingService_MessageClass() {
		return (EAttribute) queueingServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueueingService_Publisher() {
		return (EReference) queueingServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueueingService_Throttlingservice() {
		return (EReference) queueingServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueueingService_Ratelimiter() {
		return (EReference) queueingServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueueingService_Prioritizer() {
		return (EReference) queueingServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueingService_BatchNumber() {
		return (EAttribute) queueingServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueueingService_MessageRate() {
		return (EAttribute) queueingServiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQueueingService__PublishMessage() {
		return queueingServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThrottlingService() {
		return throttlingServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThrottlingService_Queueingservice() {
		return (EReference) throttlingServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getThrottlingService__ScheduleMessage() {
		return throttlingServiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublisher() {
		return publisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublisher_ID() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublisher_DateReceived() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublisher_DatePublished() {
		return (EAttribute) publisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublisher_Notificationservice() {
		return (EReference) publisherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPublisher__PublishMessage() {
		return publisherEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPublisher__UpdateStatus() {
		return publisherEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRateLimiter() {
		return rateLimiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRateLimiter_Queueingservice() {
		return (EReference) rateLimiterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRateLimiter__SetLimit() {
		return rateLimiterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrioritizer() {
		return prioritizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrioritizer_Queueingservice() {
		return (EReference) prioritizerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrioritizer__UpdatePriority() {
		return prioritizerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessageClass() {
		return messageClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNotificationStatus() {
		return notificationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMessagePriority() {
		return messagePriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationServiceFactory getNotificationServiceFactory() {
		return (NotificationServiceFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		notificationServiceEClass = createEClass(NOTIFICATION_SERVICE);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__ID);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__SUBSCRIBER_ID);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__MESSAGE_ID);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__MESSAGE_CLASS);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__QUEUE_ID);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__MESSAGE);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__NOTIFICATION_STATUS);
		createEReference(notificationServiceEClass, NOTIFICATION_SERVICE__QUEUEINGSERVICE);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__MESSAGE_PRIORITY);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__NOTIFICATION_DATE);
		createEAttribute(notificationServiceEClass, NOTIFICATION_SERVICE__MESSAGE_RATE);
		createEOperation(notificationServiceEClass, NOTIFICATION_SERVICE___QUEUE_MESSAGE);

		queueingServiceEClass = createEClass(QUEUEING_SERVICE);
		createEAttribute(queueingServiceEClass, QUEUEING_SERVICE__ID);
		createEAttribute(queueingServiceEClass, QUEUEING_SERVICE__MESSAGE);
		createEAttribute(queueingServiceEClass, QUEUEING_SERVICE__DATE_TIME_QUEUED);
		createEAttribute(queueingServiceEClass, QUEUEING_SERVICE__DATE_SENT);
		createEAttribute(queueingServiceEClass, QUEUEING_SERVICE__MESSAGE_PRIORITY);
		createEAttribute(queueingServiceEClass, QUEUEING_SERVICE__MESSAGE_CLASS);
		createEReference(queueingServiceEClass, QUEUEING_SERVICE__PUBLISHER);
		createEReference(queueingServiceEClass, QUEUEING_SERVICE__THROTTLINGSERVICE);
		createEReference(queueingServiceEClass, QUEUEING_SERVICE__RATELIMITER);
		createEReference(queueingServiceEClass, QUEUEING_SERVICE__PRIORITIZER);
		createEAttribute(queueingServiceEClass, QUEUEING_SERVICE__BATCH_NUMBER);
		createEAttribute(queueingServiceEClass, QUEUEING_SERVICE__MESSAGE_RATE);
		createEOperation(queueingServiceEClass, QUEUEING_SERVICE___PUBLISH_MESSAGE);

		throttlingServiceEClass = createEClass(THROTTLING_SERVICE);
		createEReference(throttlingServiceEClass, THROTTLING_SERVICE__QUEUEINGSERVICE);
		createEOperation(throttlingServiceEClass, THROTTLING_SERVICE___SCHEDULE_MESSAGE);

		publisherEClass = createEClass(PUBLISHER);
		createEAttribute(publisherEClass, PUBLISHER__ID);
		createEAttribute(publisherEClass, PUBLISHER__DATE_RECEIVED);
		createEAttribute(publisherEClass, PUBLISHER__DATE_PUBLISHED);
		createEReference(publisherEClass, PUBLISHER__NOTIFICATIONSERVICE);
		createEOperation(publisherEClass, PUBLISHER___PUBLISH_MESSAGE);
		createEOperation(publisherEClass, PUBLISHER___UPDATE_STATUS);

		rateLimiterEClass = createEClass(RATE_LIMITER);
		createEReference(rateLimiterEClass, RATE_LIMITER__QUEUEINGSERVICE);
		createEOperation(rateLimiterEClass, RATE_LIMITER___SET_LIMIT);

		prioritizerEClass = createEClass(PRIORITIZER);
		createEReference(prioritizerEClass, PRIORITIZER__QUEUEINGSERVICE);
		createEOperation(prioritizerEClass, PRIORITIZER___UPDATE_PRIORITY);

		// Create enums
		messageClassEEnum = createEEnum(MESSAGE_CLASS);
		notificationStatusEEnum = createEEnum(NOTIFICATION_STATUS);
		messagePriorityEEnum = createEEnum(MESSAGE_PRIORITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(notificationServiceEClass, NotificationService.class, "NotificationService", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotificationService_ID(), ecorePackage.getEString(), "ID", null, 0, 1,
				NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationService_SubscriberId(), ecorePackage.getEString(), "subscriberId", null, 0, 1,
				NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationService_MessageId(), ecorePackage.getEString(), "messageId", null, 0, 1,
				NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationService_MessageClass(), this.getMessageClass(), "messageClass", null, 0, 1,
				NotificationService.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationService_QueueId(), ecorePackage.getEString(), "queueId", null, 0, 1,
				NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationService_Message(), ecorePackage.getEChar(), "message", null, 0, 1,
				NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationService_NotificationStatus(), this.getNotificationStatus(), "notificationStatus",
				null, 0, 1, NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotificationService_Queueingservice(), this.getQueueingService(), null, "queueingservice",
				null, 0, 1, NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationService_MessagePriority(), this.getMessagePriority(), "messagePriority", null, 0,
				1, NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationService_NotificationDate(), ecorePackage.getEDate(), "notificationDate", null, 0,
				1, NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationService_MessageRate(), ecorePackage.getEInt(), "messageRate", null, 0, 1,
				NotificationService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNotificationService__QueueMessage(), ecorePackage.getEObject(), "queueMessage", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(queueingServiceEClass, QueueingService.class, "QueueingService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueueingService_ID(), ecorePackage.getEString(), "ID", null, 0, 1, QueueingService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueingService_Message(), ecorePackage.getEChar(), "message", null, 0, 1,
				QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueingService_DateTimeQueued(), ecorePackage.getEDate(), "dateTimeQueued", null, 0, 1,
				QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueingService_DateSent(), ecorePackage.getEDate(), "dateSent", null, 0, 1,
				QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueingService_MessagePriority(), this.getMessagePriority(), "messagePriority", null, 0, 1,
				QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueingService_MessageClass(), this.getMessageClass(), "messageClass", null, 0, 1,
				QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQueueingService_Publisher(), this.getPublisher(), null, "publisher", null, 0, 1,
				QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueueingService_Throttlingservice(), this.getThrottlingService(),
				this.getThrottlingService_Queueingservice(), "throttlingservice", null, 0, 1, QueueingService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueueingService_Ratelimiter(), this.getRateLimiter(), this.getRateLimiter_Queueingservice(),
				"ratelimiter", null, 0, 1, QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueueingService_Prioritizer(), this.getPrioritizer(), this.getPrioritizer_Queueingservice(),
				"prioritizer", null, 0, 1, QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueingService_BatchNumber(), ecorePackage.getEChar(), "batchNumber", null, 0, 1,
				QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueueingService_MessageRate(), ecorePackage.getEInt(), "messageRate", null, 0, 1,
				QueueingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getQueueingService__PublishMessage(), null, "publishMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(throttlingServiceEClass, ThrottlingService.class, "ThrottlingService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThrottlingService_Queueingservice(), this.getQueueingService(),
				this.getQueueingService_Throttlingservice(), "queueingservice", null, 0, 1, ThrottlingService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getThrottlingService__ScheduleMessage(), null, "scheduleMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(publisherEClass, Publisher.class, "Publisher", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublisher_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Publisher.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_DateReceived(), ecorePackage.getEDate(), "dateReceived", null, 0, 1,
				Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublisher_DatePublished(), ecorePackage.getEDate(), "datePublished", null, 0, 1,
				Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPublisher_Notificationservice(), this.getNotificationService(), null, "notificationservice",
				null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPublisher__PublishMessage(), null, "publishMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPublisher__UpdateStatus(), null, "updateStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rateLimiterEClass, RateLimiter.class, "RateLimiter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRateLimiter_Queueingservice(), this.getQueueingService(),
				this.getQueueingService_Ratelimiter(), "queueingservice", null, 0, 1, RateLimiter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getRateLimiter__SetLimit(), null, "setLimit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(prioritizerEClass, Prioritizer.class, "Prioritizer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrioritizer_Queueingservice(), this.getQueueingService(),
				this.getQueueingService_Prioritizer(), "queueingservice", null, 0, 1, Prioritizer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getPrioritizer__UpdatePriority(), null, "updatePriority", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(messageClassEEnum, MessageClass.class, "MessageClass");
		addEEnumLiteral(messageClassEEnum, MessageClass.BULK);
		addEEnumLiteral(messageClassEEnum, MessageClass.SINGLE);

		initEEnum(notificationStatusEEnum, NotificationStatus.class, "NotificationStatus");
		addEEnumLiteral(notificationStatusEEnum, NotificationStatus.SENT);
		addEEnumLiteral(notificationStatusEEnum, NotificationStatus.QUEUED);
		addEEnumLiteral(notificationStatusEEnum, NotificationStatus.FAILED);

		initEEnum(messagePriorityEEnum, MessagePriority.class, "MessagePriority");
		addEEnumLiteral(messagePriorityEEnum, MessagePriority.LOW);
		addEEnumLiteral(messagePriorityEEnum, MessagePriority.MEDIUM);
		addEEnumLiteral(messagePriorityEEnum, MessagePriority.HIGH);

		// Create resource
		createResource(eNS_URI);
	}

} //NotificationServicePackageImpl
