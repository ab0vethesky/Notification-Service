/**
 */
package notificationService.impl;

import notificationService.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotificationServiceFactoryImpl extends EFactoryImpl implements NotificationServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotificationServiceFactory init() {
		try {
			NotificationServiceFactory theNotificationServiceFactory = (NotificationServiceFactory) EPackage.Registry.INSTANCE
					.getEFactory(NotificationServicePackage.eNS_URI);
			if (theNotificationServiceFactory != null) {
				return theNotificationServiceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NotificationServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NotificationServicePackage.NOTIFICATION_SERVICE:
			return createNotificationService();
		case NotificationServicePackage.QUEUEING_SERVICE:
			return createQueueingService();
		case NotificationServicePackage.THROTTLING_SERVICE:
			return createThrottlingService();
		case NotificationServicePackage.PUBLISHER:
			return createPublisher();
		case NotificationServicePackage.RATE_LIMITER:
			return createRateLimiter();
		case NotificationServicePackage.PRIORITIZER:
			return createPrioritizer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case NotificationServicePackage.MESSAGE_CLASS:
			return createMessageClassFromString(eDataType, initialValue);
		case NotificationServicePackage.NOTIFICATION_STATUS:
			return createNotificationStatusFromString(eDataType, initialValue);
		case NotificationServicePackage.MESSAGE_PRIORITY:
			return createMessagePriorityFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case NotificationServicePackage.MESSAGE_CLASS:
			return convertMessageClassToString(eDataType, instanceValue);
		case NotificationServicePackage.NOTIFICATION_STATUS:
			return convertNotificationStatusToString(eDataType, instanceValue);
		case NotificationServicePackage.MESSAGE_PRIORITY:
			return convertMessagePriorityToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationService createNotificationService() {
		NotificationServiceImpl notificationService = new NotificationServiceImpl();
		return notificationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueingService createQueueingService() {
		QueueingServiceImpl queueingService = new QueueingServiceImpl();
		return queueingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrottlingService createThrottlingService() {
		ThrottlingServiceImpl throttlingService = new ThrottlingServiceImpl();
		return throttlingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RateLimiter createRateLimiter() {
		RateLimiterImpl rateLimiter = new RateLimiterImpl();
		return rateLimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritizer createPrioritizer() {
		PrioritizerImpl prioritizer = new PrioritizerImpl();
		return prioritizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageClass createMessageClassFromString(EDataType eDataType, String initialValue) {
		MessageClass result = MessageClass.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationStatus createNotificationStatusFromString(EDataType eDataType, String initialValue) {
		NotificationStatus result = NotificationStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePriority createMessagePriorityFromString(EDataType eDataType, String initialValue) {
		MessagePriority result = MessagePriority.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessagePriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationServicePackage getNotificationServicePackage() {
		return (NotificationServicePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NotificationServicePackage getPackage() {
		return NotificationServicePackage.eINSTANCE;
	}

} //NotificationServiceFactoryImpl
