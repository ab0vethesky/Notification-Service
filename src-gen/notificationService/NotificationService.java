/**
 */
package notificationService;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notificationService.NotificationService#getID <em>ID</em>}</li>
 *   <li>{@link notificationService.NotificationService#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link notificationService.NotificationService#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link notificationService.NotificationService#getMessageClass <em>Message Class</em>}</li>
 *   <li>{@link notificationService.NotificationService#getQueueId <em>Queue Id</em>}</li>
 *   <li>{@link notificationService.NotificationService#getMessage <em>Message</em>}</li>
 *   <li>{@link notificationService.NotificationService#getNotificationStatus <em>Notification Status</em>}</li>
 *   <li>{@link notificationService.NotificationService#getQueueingservice <em>Queueingservice</em>}</li>
 *   <li>{@link notificationService.NotificationService#getMessagePriority <em>Message Priority</em>}</li>
 *   <li>{@link notificationService.NotificationService#getNotificationDate <em>Notification Date</em>}</li>
 *   <li>{@link notificationService.NotificationService#getMessageRate <em>Message Rate</em>}</li>
 * </ul>
 *
 * @see notificationService.NotificationServicePackage#getNotificationService()
 * @model
 * @generated
 */
public interface NotificationService extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see notificationService.NotificationServicePackage#getNotificationService_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Id</em>' attribute.
	 * @see #setSubscriberId(String)
	 * @see notificationService.NotificationServicePackage#getNotificationService_SubscriberId()
	 * @model unique="false"
	 * @generated
	 */
	String getSubscriberId();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getSubscriberId <em>Subscriber Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Id</em>' attribute.
	 * @see #getSubscriberId()
	 * @generated
	 */
	void setSubscriberId(String value);

	/**
	 * Returns the value of the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Id</em>' attribute.
	 * @see #setMessageId(String)
	 * @see notificationService.NotificationServicePackage#getNotificationService_MessageId()
	 * @model unique="false"
	 * @generated
	 */
	String getMessageId();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(String value);

	/**
	 * Returns the value of the '<em><b>Message Class</b></em>' attribute.
	 * The literals are from the enumeration {@link notificationService.MessageClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Class</em>' attribute.
	 * @see notificationService.MessageClass
	 * @see #setMessageClass(MessageClass)
	 * @see notificationService.NotificationServicePackage#getNotificationService_MessageClass()
	 * @model transient="true"
	 * @generated
	 */
	MessageClass getMessageClass();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getMessageClass <em>Message Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Class</em>' attribute.
	 * @see notificationService.MessageClass
	 * @see #getMessageClass()
	 * @generated
	 */
	void setMessageClass(MessageClass value);

	/**
	 * Returns the value of the '<em><b>Queue Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Id</em>' attribute.
	 * @see #setQueueId(String)
	 * @see notificationService.NotificationServicePackage#getNotificationService_QueueId()
	 * @model unique="false"
	 * @generated
	 */
	String getQueueId();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getQueueId <em>Queue Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Id</em>' attribute.
	 * @see #getQueueId()
	 * @generated
	 */
	void setQueueId(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(char)
	 * @see notificationService.NotificationServicePackage#getNotificationService_Message()
	 * @model
	 * @generated
	 */
	char getMessage();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(char value);

	/**
	 * Returns the value of the '<em><b>Notification Status</b></em>' attribute.
	 * The literals are from the enumeration {@link notificationService.NotificationStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Status</em>' attribute.
	 * @see notificationService.NotificationStatus
	 * @see #setNotificationStatus(NotificationStatus)
	 * @see notificationService.NotificationServicePackage#getNotificationService_NotificationStatus()
	 * @model
	 * @generated
	 */
	NotificationStatus getNotificationStatus();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getNotificationStatus <em>Notification Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Status</em>' attribute.
	 * @see notificationService.NotificationStatus
	 * @see #getNotificationStatus()
	 * @generated
	 */
	void setNotificationStatus(NotificationStatus value);

	/**
	 * Returns the value of the '<em><b>Queueingservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queueingservice</em>' reference.
	 * @see #setQueueingservice(QueueingService)
	 * @see notificationService.NotificationServicePackage#getNotificationService_Queueingservice()
	 * @model
	 * @generated
	 */
	QueueingService getQueueingservice();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getQueueingservice <em>Queueingservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queueingservice</em>' reference.
	 * @see #getQueueingservice()
	 * @generated
	 */
	void setQueueingservice(QueueingService value);

	/**
	 * Returns the value of the '<em><b>Message Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link notificationService.MessagePriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Priority</em>' attribute.
	 * @see notificationService.MessagePriority
	 * @see #setMessagePriority(MessagePriority)
	 * @see notificationService.NotificationServicePackage#getNotificationService_MessagePriority()
	 * @model
	 * @generated
	 */
	MessagePriority getMessagePriority();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getMessagePriority <em>Message Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Priority</em>' attribute.
	 * @see notificationService.MessagePriority
	 * @see #getMessagePriority()
	 * @generated
	 */
	void setMessagePriority(MessagePriority value);

	/**
	 * Returns the value of the '<em><b>Notification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Date</em>' attribute.
	 * @see #setNotificationDate(Date)
	 * @see notificationService.NotificationServicePackage#getNotificationService_NotificationDate()
	 * @model
	 * @generated
	 */
	Date getNotificationDate();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getNotificationDate <em>Notification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Date</em>' attribute.
	 * @see #getNotificationDate()
	 * @generated
	 */
	void setNotificationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Message Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Rate</em>' attribute.
	 * @see #setMessageRate(int)
	 * @see notificationService.NotificationServicePackage#getNotificationService_MessageRate()
	 * @model
	 * @generated
	 */
	int getMessageRate();

	/**
	 * Sets the value of the '{@link notificationService.NotificationService#getMessageRate <em>Message Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Rate</em>' attribute.
	 * @see #getMessageRate()
	 * @generated
	 */
	void setMessageRate(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject queueMessage();

} // NotificationService
