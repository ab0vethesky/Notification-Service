/**
 */
package notificationService;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notificationService.Publisher#getID <em>ID</em>}</li>
 *   <li>{@link notificationService.Publisher#getDateReceived <em>Date Received</em>}</li>
 *   <li>{@link notificationService.Publisher#getDatePublished <em>Date Published</em>}</li>
 *   <li>{@link notificationService.Publisher#getNotificationservice <em>Notificationservice</em>}</li>
 * </ul>
 *
 * @see notificationService.NotificationServicePackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see notificationService.NotificationServicePackage#getPublisher_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link notificationService.Publisher#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Date Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Received</em>' attribute.
	 * @see #setDateReceived(Date)
	 * @see notificationService.NotificationServicePackage#getPublisher_DateReceived()
	 * @model
	 * @generated
	 */
	Date getDateReceived();

	/**
	 * Sets the value of the '{@link notificationService.Publisher#getDateReceived <em>Date Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Received</em>' attribute.
	 * @see #getDateReceived()
	 * @generated
	 */
	void setDateReceived(Date value);

	/**
	 * Returns the value of the '<em><b>Date Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Published</em>' attribute.
	 * @see #setDatePublished(Date)
	 * @see notificationService.NotificationServicePackage#getPublisher_DatePublished()
	 * @model
	 * @generated
	 */
	Date getDatePublished();

	/**
	 * Sets the value of the '{@link notificationService.Publisher#getDatePublished <em>Date Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Published</em>' attribute.
	 * @see #getDatePublished()
	 * @generated
	 */
	void setDatePublished(Date value);

	/**
	 * Returns the value of the '<em><b>Notificationservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notificationservice</em>' reference.
	 * @see #setNotificationservice(NotificationService)
	 * @see notificationService.NotificationServicePackage#getPublisher_Notificationservice()
	 * @model
	 * @generated
	 */
	NotificationService getNotificationservice();

	/**
	 * Sets the value of the '{@link notificationService.Publisher#getNotificationservice <em>Notificationservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notificationservice</em>' reference.
	 * @see #getNotificationservice()
	 * @generated
	 */
	void setNotificationservice(NotificationService value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void publishMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateStatus();

} // Publisher
