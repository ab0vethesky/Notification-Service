/**
 */
package notificationService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see notificationService.NotificationServiceFactory
 * @model kind="package"
 * @generated
 */
public interface NotificationServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "notificationService";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/notificationService";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "notificationService";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotificationServicePackage eINSTANCE = notificationService.impl.NotificationServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link notificationService.impl.NotificationServiceImpl <em>Notification Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.NotificationServiceImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getNotificationService()
	 * @generated
	 */
	int NOTIFICATION_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Subscriber Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__SUBSCRIBER_ID = 1;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__MESSAGE_ID = 2;

	/**
	 * The feature id for the '<em><b>Message Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__MESSAGE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Queue Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__QUEUE_ID = 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Notification Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__NOTIFICATION_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Queueingservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__QUEUEINGSERVICE = 7;

	/**
	 * The feature id for the '<em><b>Message Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__MESSAGE_PRIORITY = 8;

	/**
	 * The feature id for the '<em><b>Notification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__NOTIFICATION_DATE = 9;

	/**
	 * The feature id for the '<em><b>Message Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE__MESSAGE_RATE = 10;

	/**
	 * The number of structural features of the '<em>Notification Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Queue Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE___QUEUE_MESSAGE = 0;

	/**
	 * The number of operations of the '<em>Notification Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_SERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link notificationService.impl.QueueingServiceImpl <em>Queueing Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.QueueingServiceImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getQueueingService()
	 * @generated
	 */
	int QUEUEING_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Date Time Queued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__DATE_TIME_QUEUED = 2;

	/**
	 * The feature id for the '<em><b>Date Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__DATE_SENT = 3;

	/**
	 * The feature id for the '<em><b>Message Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__MESSAGE_PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>Message Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__MESSAGE_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__PUBLISHER = 6;

	/**
	 * The feature id for the '<em><b>Throttlingservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__THROTTLINGSERVICE = 7;

	/**
	 * The feature id for the '<em><b>Ratelimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__RATELIMITER = 8;

	/**
	 * The feature id for the '<em><b>Prioritizer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__PRIORITIZER = 9;

	/**
	 * The feature id for the '<em><b>Batch Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__BATCH_NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Message Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE__MESSAGE_RATE = 11;

	/**
	 * The number of structural features of the '<em>Queueing Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Publish Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE___PUBLISH_MESSAGE = 0;

	/**
	 * The number of operations of the '<em>Queueing Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUEING_SERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link notificationService.impl.ThrottlingServiceImpl <em>Throttling Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.ThrottlingServiceImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getThrottlingService()
	 * @generated
	 */
	int THROTTLING_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Queueingservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLING_SERVICE__QUEUEINGSERVICE = 0;

	/**
	 * The number of structural features of the '<em>Throttling Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLING_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Schedule Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLING_SERVICE___SCHEDULE_MESSAGE = 0;

	/**
	 * The number of operations of the '<em>Throttling Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROTTLING_SERVICE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link notificationService.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.PublisherImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ID = 0;

	/**
	 * The feature id for the '<em><b>Date Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__DATE_RECEIVED = 1;

	/**
	 * The feature id for the '<em><b>Date Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__DATE_PUBLISHED = 2;

	/**
	 * The feature id for the '<em><b>Notificationservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NOTIFICATIONSERVICE = 3;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Publish Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER___PUBLISH_MESSAGE = 0;

	/**
	 * The operation id for the '<em>Update Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER___UPDATE_STATUS = 1;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link notificationService.impl.RateLimiterImpl <em>Rate Limiter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.RateLimiterImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getRateLimiter()
	 * @generated
	 */
	int RATE_LIMITER = 4;

	/**
	 * The feature id for the '<em><b>Queueingservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_LIMITER__QUEUEINGSERVICE = 0;

	/**
	 * The number of structural features of the '<em>Rate Limiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_LIMITER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Set Limit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_LIMITER___SET_LIMIT = 0;

	/**
	 * The number of operations of the '<em>Rate Limiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_LIMITER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link notificationService.impl.PrioritizerImpl <em>Prioritizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.impl.PrioritizerImpl
	 * @see notificationService.impl.NotificationServicePackageImpl#getPrioritizer()
	 * @generated
	 */
	int PRIORITIZER = 5;

	/**
	 * The feature id for the '<em><b>Queueingservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZER__QUEUEINGSERVICE = 0;

	/**
	 * The number of structural features of the '<em>Prioritizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update Priority</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZER___UPDATE_PRIORITY = 0;

	/**
	 * The number of operations of the '<em>Prioritizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link notificationService.MessageClass <em>Message Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.MessageClass
	 * @see notificationService.impl.NotificationServicePackageImpl#getMessageClass()
	 * @generated
	 */
	int MESSAGE_CLASS = 6;

	/**
	 * The meta object id for the '{@link notificationService.NotificationStatus <em>Notification Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.NotificationStatus
	 * @see notificationService.impl.NotificationServicePackageImpl#getNotificationStatus()
	 * @generated
	 */
	int NOTIFICATION_STATUS = 7;

	/**
	 * The meta object id for the '{@link notificationService.MessagePriority <em>Message Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notificationService.MessagePriority
	 * @see notificationService.impl.NotificationServicePackageImpl#getMessagePriority()
	 * @generated
	 */
	int MESSAGE_PRIORITY = 8;

	/**
	 * Returns the meta object for class '{@link notificationService.NotificationService <em>Notification Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Service</em>'.
	 * @see notificationService.NotificationService
	 * @generated
	 */
	EClass getNotificationService();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see notificationService.NotificationService#getID()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_ID();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getSubscriberId <em>Subscriber Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Id</em>'.
	 * @see notificationService.NotificationService#getSubscriberId()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_SubscriberId();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getMessageId <em>Message Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id</em>'.
	 * @see notificationService.NotificationService#getMessageId()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_MessageId();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getMessageClass <em>Message Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Class</em>'.
	 * @see notificationService.NotificationService#getMessageClass()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_MessageClass();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getQueueId <em>Queue Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Id</em>'.
	 * @see notificationService.NotificationService#getQueueId()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_QueueId();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see notificationService.NotificationService#getMessage()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_Message();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getNotificationStatus <em>Notification Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Status</em>'.
	 * @see notificationService.NotificationService#getNotificationStatus()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_NotificationStatus();

	/**
	 * Returns the meta object for the reference '{@link notificationService.NotificationService#getQueueingservice <em>Queueingservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queueingservice</em>'.
	 * @see notificationService.NotificationService#getQueueingservice()
	 * @see #getNotificationService()
	 * @generated
	 */
	EReference getNotificationService_Queueingservice();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getMessagePriority <em>Message Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Priority</em>'.
	 * @see notificationService.NotificationService#getMessagePriority()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_MessagePriority();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getNotificationDate <em>Notification Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Date</em>'.
	 * @see notificationService.NotificationService#getNotificationDate()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_NotificationDate();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.NotificationService#getMessageRate <em>Message Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Rate</em>'.
	 * @see notificationService.NotificationService#getMessageRate()
	 * @see #getNotificationService()
	 * @generated
	 */
	EAttribute getNotificationService_MessageRate();

	/**
	 * Returns the meta object for the '{@link notificationService.NotificationService#queueMessage() <em>Queue Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Queue Message</em>' operation.
	 * @see notificationService.NotificationService#queueMessage()
	 * @generated
	 */
	EOperation getNotificationService__QueueMessage();

	/**
	 * Returns the meta object for class '{@link notificationService.QueueingService <em>Queueing Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queueing Service</em>'.
	 * @see notificationService.QueueingService
	 * @generated
	 */
	EClass getQueueingService();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.QueueingService#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see notificationService.QueueingService#getID()
	 * @see #getQueueingService()
	 * @generated
	 */
	EAttribute getQueueingService_ID();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.QueueingService#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see notificationService.QueueingService#getMessage()
	 * @see #getQueueingService()
	 * @generated
	 */
	EAttribute getQueueingService_Message();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.QueueingService#getDateTimeQueued <em>Date Time Queued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Queued</em>'.
	 * @see notificationService.QueueingService#getDateTimeQueued()
	 * @see #getQueueingService()
	 * @generated
	 */
	EAttribute getQueueingService_DateTimeQueued();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.QueueingService#getDateSent <em>Date Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Sent</em>'.
	 * @see notificationService.QueueingService#getDateSent()
	 * @see #getQueueingService()
	 * @generated
	 */
	EAttribute getQueueingService_DateSent();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.QueueingService#getMessagePriority <em>Message Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Priority</em>'.
	 * @see notificationService.QueueingService#getMessagePriority()
	 * @see #getQueueingService()
	 * @generated
	 */
	EAttribute getQueueingService_MessagePriority();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.QueueingService#getMessageClass <em>Message Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Class</em>'.
	 * @see notificationService.QueueingService#getMessageClass()
	 * @see #getQueueingService()
	 * @generated
	 */
	EAttribute getQueueingService_MessageClass();

	/**
	 * Returns the meta object for the reference '{@link notificationService.QueueingService#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher</em>'.
	 * @see notificationService.QueueingService#getPublisher()
	 * @see #getQueueingService()
	 * @generated
	 */
	EReference getQueueingService_Publisher();

	/**
	 * Returns the meta object for the reference '{@link notificationService.QueueingService#getThrottlingservice <em>Throttlingservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Throttlingservice</em>'.
	 * @see notificationService.QueueingService#getThrottlingservice()
	 * @see #getQueueingService()
	 * @generated
	 */
	EReference getQueueingService_Throttlingservice();

	/**
	 * Returns the meta object for the reference '{@link notificationService.QueueingService#getRatelimiter <em>Ratelimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ratelimiter</em>'.
	 * @see notificationService.QueueingService#getRatelimiter()
	 * @see #getQueueingService()
	 * @generated
	 */
	EReference getQueueingService_Ratelimiter();

	/**
	 * Returns the meta object for the reference '{@link notificationService.QueueingService#getPrioritizer <em>Prioritizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prioritizer</em>'.
	 * @see notificationService.QueueingService#getPrioritizer()
	 * @see #getQueueingService()
	 * @generated
	 */
	EReference getQueueingService_Prioritizer();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.QueueingService#getBatchNumber <em>Batch Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Number</em>'.
	 * @see notificationService.QueueingService#getBatchNumber()
	 * @see #getQueueingService()
	 * @generated
	 */
	EAttribute getQueueingService_BatchNumber();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.QueueingService#getMessageRate <em>Message Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Rate</em>'.
	 * @see notificationService.QueueingService#getMessageRate()
	 * @see #getQueueingService()
	 * @generated
	 */
	EAttribute getQueueingService_MessageRate();

	/**
	 * Returns the meta object for the '{@link notificationService.QueueingService#publishMessage() <em>Publish Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish Message</em>' operation.
	 * @see notificationService.QueueingService#publishMessage()
	 * @generated
	 */
	EOperation getQueueingService__PublishMessage();

	/**
	 * Returns the meta object for class '{@link notificationService.ThrottlingService <em>Throttling Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throttling Service</em>'.
	 * @see notificationService.ThrottlingService
	 * @generated
	 */
	EClass getThrottlingService();

	/**
	 * Returns the meta object for the reference '{@link notificationService.ThrottlingService#getQueueingservice <em>Queueingservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queueingservice</em>'.
	 * @see notificationService.ThrottlingService#getQueueingservice()
	 * @see #getThrottlingService()
	 * @generated
	 */
	EReference getThrottlingService_Queueingservice();

	/**
	 * Returns the meta object for the '{@link notificationService.ThrottlingService#scheduleMessage() <em>Schedule Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Schedule Message</em>' operation.
	 * @see notificationService.ThrottlingService#scheduleMessage()
	 * @generated
	 */
	EOperation getThrottlingService__ScheduleMessage();

	/**
	 * Returns the meta object for class '{@link notificationService.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see notificationService.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.Publisher#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see notificationService.Publisher#getID()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_ID();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.Publisher#getDateReceived <em>Date Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Received</em>'.
	 * @see notificationService.Publisher#getDateReceived()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_DateReceived();

	/**
	 * Returns the meta object for the attribute '{@link notificationService.Publisher#getDatePublished <em>Date Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Published</em>'.
	 * @see notificationService.Publisher#getDatePublished()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_DatePublished();

	/**
	 * Returns the meta object for the reference '{@link notificationService.Publisher#getNotificationservice <em>Notificationservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notificationservice</em>'.
	 * @see notificationService.Publisher#getNotificationservice()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Notificationservice();

	/**
	 * Returns the meta object for the '{@link notificationService.Publisher#publishMessage() <em>Publish Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish Message</em>' operation.
	 * @see notificationService.Publisher#publishMessage()
	 * @generated
	 */
	EOperation getPublisher__PublishMessage();

	/**
	 * Returns the meta object for the '{@link notificationService.Publisher#updateStatus() <em>Update Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Status</em>' operation.
	 * @see notificationService.Publisher#updateStatus()
	 * @generated
	 */
	EOperation getPublisher__UpdateStatus();

	/**
	 * Returns the meta object for class '{@link notificationService.RateLimiter <em>Rate Limiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate Limiter</em>'.
	 * @see notificationService.RateLimiter
	 * @generated
	 */
	EClass getRateLimiter();

	/**
	 * Returns the meta object for the reference '{@link notificationService.RateLimiter#getQueueingservice <em>Queueingservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queueingservice</em>'.
	 * @see notificationService.RateLimiter#getQueueingservice()
	 * @see #getRateLimiter()
	 * @generated
	 */
	EReference getRateLimiter_Queueingservice();

	/**
	 * Returns the meta object for the '{@link notificationService.RateLimiter#setLimit() <em>Set Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Limit</em>' operation.
	 * @see notificationService.RateLimiter#setLimit()
	 * @generated
	 */
	EOperation getRateLimiter__SetLimit();

	/**
	 * Returns the meta object for class '{@link notificationService.Prioritizer <em>Prioritizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prioritizer</em>'.
	 * @see notificationService.Prioritizer
	 * @generated
	 */
	EClass getPrioritizer();

	/**
	 * Returns the meta object for the reference '{@link notificationService.Prioritizer#getQueueingservice <em>Queueingservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queueingservice</em>'.
	 * @see notificationService.Prioritizer#getQueueingservice()
	 * @see #getPrioritizer()
	 * @generated
	 */
	EReference getPrioritizer_Queueingservice();

	/**
	 * Returns the meta object for the '{@link notificationService.Prioritizer#updatePriority() <em>Update Priority</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Priority</em>' operation.
	 * @see notificationService.Prioritizer#updatePriority()
	 * @generated
	 */
	EOperation getPrioritizer__UpdatePriority();

	/**
	 * Returns the meta object for enum '{@link notificationService.MessageClass <em>Message Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Class</em>'.
	 * @see notificationService.MessageClass
	 * @generated
	 */
	EEnum getMessageClass();

	/**
	 * Returns the meta object for enum '{@link notificationService.NotificationStatus <em>Notification Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Status</em>'.
	 * @see notificationService.NotificationStatus
	 * @generated
	 */
	EEnum getNotificationStatus();

	/**
	 * Returns the meta object for enum '{@link notificationService.MessagePriority <em>Message Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Priority</em>'.
	 * @see notificationService.MessagePriority
	 * @generated
	 */
	EEnum getMessagePriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NotificationServiceFactory getNotificationServiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link notificationService.impl.NotificationServiceImpl <em>Notification Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.NotificationServiceImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getNotificationService()
		 * @generated
		 */
		EClass NOTIFICATION_SERVICE = eINSTANCE.getNotificationService();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__ID = eINSTANCE.getNotificationService_ID();

		/**
		 * The meta object literal for the '<em><b>Subscriber Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__SUBSCRIBER_ID = eINSTANCE.getNotificationService_SubscriberId();

		/**
		 * The meta object literal for the '<em><b>Message Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__MESSAGE_ID = eINSTANCE.getNotificationService_MessageId();

		/**
		 * The meta object literal for the '<em><b>Message Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__MESSAGE_CLASS = eINSTANCE.getNotificationService_MessageClass();

		/**
		 * The meta object literal for the '<em><b>Queue Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__QUEUE_ID = eINSTANCE.getNotificationService_QueueId();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__MESSAGE = eINSTANCE.getNotificationService_Message();

		/**
		 * The meta object literal for the '<em><b>Notification Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__NOTIFICATION_STATUS = eINSTANCE.getNotificationService_NotificationStatus();

		/**
		 * The meta object literal for the '<em><b>Queueingservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_SERVICE__QUEUEINGSERVICE = eINSTANCE.getNotificationService_Queueingservice();

		/**
		 * The meta object literal for the '<em><b>Message Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__MESSAGE_PRIORITY = eINSTANCE.getNotificationService_MessagePriority();

		/**
		 * The meta object literal for the '<em><b>Notification Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__NOTIFICATION_DATE = eINSTANCE.getNotificationService_NotificationDate();

		/**
		 * The meta object literal for the '<em><b>Message Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_SERVICE__MESSAGE_RATE = eINSTANCE.getNotificationService_MessageRate();

		/**
		 * The meta object literal for the '<em><b>Queue Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTIFICATION_SERVICE___QUEUE_MESSAGE = eINSTANCE.getNotificationService__QueueMessage();

		/**
		 * The meta object literal for the '{@link notificationService.impl.QueueingServiceImpl <em>Queueing Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.QueueingServiceImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getQueueingService()
		 * @generated
		 */
		EClass QUEUEING_SERVICE = eINSTANCE.getQueueingService();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUEING_SERVICE__ID = eINSTANCE.getQueueingService_ID();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUEING_SERVICE__MESSAGE = eINSTANCE.getQueueingService_Message();

		/**
		 * The meta object literal for the '<em><b>Date Time Queued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUEING_SERVICE__DATE_TIME_QUEUED = eINSTANCE.getQueueingService_DateTimeQueued();

		/**
		 * The meta object literal for the '<em><b>Date Sent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUEING_SERVICE__DATE_SENT = eINSTANCE.getQueueingService_DateSent();

		/**
		 * The meta object literal for the '<em><b>Message Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUEING_SERVICE__MESSAGE_PRIORITY = eINSTANCE.getQueueingService_MessagePriority();

		/**
		 * The meta object literal for the '<em><b>Message Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUEING_SERVICE__MESSAGE_CLASS = eINSTANCE.getQueueingService_MessageClass();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUEING_SERVICE__PUBLISHER = eINSTANCE.getQueueingService_Publisher();

		/**
		 * The meta object literal for the '<em><b>Throttlingservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUEING_SERVICE__THROTTLINGSERVICE = eINSTANCE.getQueueingService_Throttlingservice();

		/**
		 * The meta object literal for the '<em><b>Ratelimiter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUEING_SERVICE__RATELIMITER = eINSTANCE.getQueueingService_Ratelimiter();

		/**
		 * The meta object literal for the '<em><b>Prioritizer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUEING_SERVICE__PRIORITIZER = eINSTANCE.getQueueingService_Prioritizer();

		/**
		 * The meta object literal for the '<em><b>Batch Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUEING_SERVICE__BATCH_NUMBER = eINSTANCE.getQueueingService_BatchNumber();

		/**
		 * The meta object literal for the '<em><b>Message Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUEING_SERVICE__MESSAGE_RATE = eINSTANCE.getQueueingService_MessageRate();

		/**
		 * The meta object literal for the '<em><b>Publish Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUEUEING_SERVICE___PUBLISH_MESSAGE = eINSTANCE.getQueueingService__PublishMessage();

		/**
		 * The meta object literal for the '{@link notificationService.impl.ThrottlingServiceImpl <em>Throttling Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.ThrottlingServiceImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getThrottlingService()
		 * @generated
		 */
		EClass THROTTLING_SERVICE = eINSTANCE.getThrottlingService();

		/**
		 * The meta object literal for the '<em><b>Queueingservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROTTLING_SERVICE__QUEUEINGSERVICE = eINSTANCE.getThrottlingService_Queueingservice();

		/**
		 * The meta object literal for the '<em><b>Schedule Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THROTTLING_SERVICE___SCHEDULE_MESSAGE = eINSTANCE.getThrottlingService__ScheduleMessage();

		/**
		 * The meta object literal for the '{@link notificationService.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.PublisherImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__ID = eINSTANCE.getPublisher_ID();

		/**
		 * The meta object literal for the '<em><b>Date Received</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__DATE_RECEIVED = eINSTANCE.getPublisher_DateReceived();

		/**
		 * The meta object literal for the '<em><b>Date Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__DATE_PUBLISHED = eINSTANCE.getPublisher_DatePublished();

		/**
		 * The meta object literal for the '<em><b>Notificationservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__NOTIFICATIONSERVICE = eINSTANCE.getPublisher_Notificationservice();

		/**
		 * The meta object literal for the '<em><b>Publish Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLISHER___PUBLISH_MESSAGE = eINSTANCE.getPublisher__PublishMessage();

		/**
		 * The meta object literal for the '<em><b>Update Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PUBLISHER___UPDATE_STATUS = eINSTANCE.getPublisher__UpdateStatus();

		/**
		 * The meta object literal for the '{@link notificationService.impl.RateLimiterImpl <em>Rate Limiter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.RateLimiterImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getRateLimiter()
		 * @generated
		 */
		EClass RATE_LIMITER = eINSTANCE.getRateLimiter();

		/**
		 * The meta object literal for the '<em><b>Queueingservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATE_LIMITER__QUEUEINGSERVICE = eINSTANCE.getRateLimiter_Queueingservice();

		/**
		 * The meta object literal for the '<em><b>Set Limit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RATE_LIMITER___SET_LIMIT = eINSTANCE.getRateLimiter__SetLimit();

		/**
		 * The meta object literal for the '{@link notificationService.impl.PrioritizerImpl <em>Prioritizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.impl.PrioritizerImpl
		 * @see notificationService.impl.NotificationServicePackageImpl#getPrioritizer()
		 * @generated
		 */
		EClass PRIORITIZER = eINSTANCE.getPrioritizer();

		/**
		 * The meta object literal for the '<em><b>Queueingservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIORITIZER__QUEUEINGSERVICE = eINSTANCE.getPrioritizer_Queueingservice();

		/**
		 * The meta object literal for the '<em><b>Update Priority</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIORITIZER___UPDATE_PRIORITY = eINSTANCE.getPrioritizer__UpdatePriority();

		/**
		 * The meta object literal for the '{@link notificationService.MessageClass <em>Message Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.MessageClass
		 * @see notificationService.impl.NotificationServicePackageImpl#getMessageClass()
		 * @generated
		 */
		EEnum MESSAGE_CLASS = eINSTANCE.getMessageClass();

		/**
		 * The meta object literal for the '{@link notificationService.NotificationStatus <em>Notification Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.NotificationStatus
		 * @see notificationService.impl.NotificationServicePackageImpl#getNotificationStatus()
		 * @generated
		 */
		EEnum NOTIFICATION_STATUS = eINSTANCE.getNotificationStatus();

		/**
		 * The meta object literal for the '{@link notificationService.MessagePriority <em>Message Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notificationService.MessagePriority
		 * @see notificationService.impl.NotificationServicePackageImpl#getMessagePriority()
		 * @generated
		 */
		EEnum MESSAGE_PRIORITY = eINSTANCE.getMessagePriority();

	}

} //NotificationServicePackage
