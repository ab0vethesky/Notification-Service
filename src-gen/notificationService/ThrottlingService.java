/**
 */
package notificationService;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throttling Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notificationService.ThrottlingService#getQueueingservice <em>Queueingservice</em>}</li>
 * </ul>
 *
 * @see notificationService.NotificationServicePackage#getThrottlingService()
 * @model
 * @generated
 */
public interface ThrottlingService extends EObject {
	/**
	 * Returns the value of the '<em><b>Queueingservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link notificationService.QueueingService#getThrottlingservice <em>Throttlingservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queueingservice</em>' reference.
	 * @see #setQueueingservice(QueueingService)
	 * @see notificationService.NotificationServicePackage#getThrottlingService_Queueingservice()
	 * @see notificationService.QueueingService#getThrottlingservice
	 * @model opposite="throttlingservice"
	 * @generated
	 */
	QueueingService getQueueingservice();

	/**
	 * Sets the value of the '{@link notificationService.ThrottlingService#getQueueingservice <em>Queueingservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queueingservice</em>' reference.
	 * @see #getQueueingservice()
	 * @generated
	 */
	void setQueueingservice(QueueingService value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void scheduleMessage();

} // ThrottlingService
