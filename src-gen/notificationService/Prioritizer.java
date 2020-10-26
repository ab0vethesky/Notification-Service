/**
 */
package notificationService;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prioritizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notificationService.Prioritizer#getQueueingservice <em>Queueingservice</em>}</li>
 * </ul>
 *
 * @see notificationService.NotificationServicePackage#getPrioritizer()
 * @model
 * @generated
 */
public interface Prioritizer extends EObject {
	/**
	 * Returns the value of the '<em><b>Queueingservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link notificationService.QueueingService#getPrioritizer <em>Prioritizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queueingservice</em>' reference.
	 * @see #setQueueingservice(QueueingService)
	 * @see notificationService.NotificationServicePackage#getPrioritizer_Queueingservice()
	 * @see notificationService.QueueingService#getPrioritizer
	 * @model opposite="prioritizer"
	 * @generated
	 */
	QueueingService getQueueingservice();

	/**
	 * Sets the value of the '{@link notificationService.Prioritizer#getQueueingservice <em>Queueingservice</em>}' reference.
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
	void updatePriority();

} // Prioritizer
