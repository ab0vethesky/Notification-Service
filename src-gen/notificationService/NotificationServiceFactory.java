/**
 */
package notificationService;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see notificationService.NotificationServicePackage
 * @generated
 */
public interface NotificationServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotificationServiceFactory eINSTANCE = notificationService.impl.NotificationServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Notification Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification Service</em>'.
	 * @generated
	 */
	NotificationService createNotificationService();

	/**
	 * Returns a new object of class '<em>Queueing Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queueing Service</em>'.
	 * @generated
	 */
	QueueingService createQueueingService();

	/**
	 * Returns a new object of class '<em>Throttling Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throttling Service</em>'.
	 * @generated
	 */
	ThrottlingService createThrottlingService();

	/**
	 * Returns a new object of class '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publisher</em>'.
	 * @generated
	 */
	Publisher createPublisher();

	/**
	 * Returns a new object of class '<em>Rate Limiter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rate Limiter</em>'.
	 * @generated
	 */
	RateLimiter createRateLimiter();

	/**
	 * Returns a new object of class '<em>Prioritizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prioritizer</em>'.
	 * @generated
	 */
	Prioritizer createPrioritizer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NotificationServicePackage getNotificationServicePackage();

} //NotificationServiceFactory
