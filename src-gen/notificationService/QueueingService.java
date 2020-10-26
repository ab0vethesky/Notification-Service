/**
 */
package notificationService;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queueing Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notificationService.QueueingService#getID <em>ID</em>}</li>
 *   <li>{@link notificationService.QueueingService#getMessage <em>Message</em>}</li>
 *   <li>{@link notificationService.QueueingService#getDateTimeQueued <em>Date Time Queued</em>}</li>
 *   <li>{@link notificationService.QueueingService#getDateSent <em>Date Sent</em>}</li>
 *   <li>{@link notificationService.QueueingService#getMessagePriority <em>Message Priority</em>}</li>
 *   <li>{@link notificationService.QueueingService#getMessageClass <em>Message Class</em>}</li>
 *   <li>{@link notificationService.QueueingService#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link notificationService.QueueingService#getThrottlingservice <em>Throttlingservice</em>}</li>
 *   <li>{@link notificationService.QueueingService#getRatelimiter <em>Ratelimiter</em>}</li>
 *   <li>{@link notificationService.QueueingService#getPrioritizer <em>Prioritizer</em>}</li>
 *   <li>{@link notificationService.QueueingService#getBatchNumber <em>Batch Number</em>}</li>
 *   <li>{@link notificationService.QueueingService#getMessageRate <em>Message Rate</em>}</li>
 * </ul>
 *
 * @see notificationService.NotificationServicePackage#getQueueingService()
 * @model
 * @generated
 */
public interface QueueingService extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see notificationService.NotificationServicePackage#getQueueingService_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(char)
	 * @see notificationService.NotificationServicePackage#getQueueingService_Message()
	 * @model
	 * @generated
	 */
	char getMessage();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(char value);

	/**
	 * Returns the value of the '<em><b>Date Time Queued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Queued</em>' attribute.
	 * @see #setDateTimeQueued(Date)
	 * @see notificationService.NotificationServicePackage#getQueueingService_DateTimeQueued()
	 * @model
	 * @generated
	 */
	Date getDateTimeQueued();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getDateTimeQueued <em>Date Time Queued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Queued</em>' attribute.
	 * @see #getDateTimeQueued()
	 * @generated
	 */
	void setDateTimeQueued(Date value);

	/**
	 * Returns the value of the '<em><b>Date Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Sent</em>' attribute.
	 * @see #setDateSent(Date)
	 * @see notificationService.NotificationServicePackage#getQueueingService_DateSent()
	 * @model
	 * @generated
	 */
	Date getDateSent();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getDateSent <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Sent</em>' attribute.
	 * @see #getDateSent()
	 * @generated
	 */
	void setDateSent(Date value);

	/**
	 * Returns the value of the '<em><b>Message Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link notificationService.MessagePriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Priority</em>' attribute.
	 * @see notificationService.MessagePriority
	 * @see #setMessagePriority(MessagePriority)
	 * @see notificationService.NotificationServicePackage#getQueueingService_MessagePriority()
	 * @model
	 * @generated
	 */
	MessagePriority getMessagePriority();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getMessagePriority <em>Message Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Priority</em>' attribute.
	 * @see notificationService.MessagePriority
	 * @see #getMessagePriority()
	 * @generated
	 */
	void setMessagePriority(MessagePriority value);

	/**
	 * Returns the value of the '<em><b>Message Class</b></em>' attribute.
	 * The literals are from the enumeration {@link notificationService.MessageClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Class</em>' attribute.
	 * @see notificationService.MessageClass
	 * @see #setMessageClass(MessageClass)
	 * @see notificationService.NotificationServicePackage#getQueueingService_MessageClass()
	 * @model
	 * @generated
	 */
	MessageClass getMessageClass();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getMessageClass <em>Message Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Class</em>' attribute.
	 * @see notificationService.MessageClass
	 * @see #getMessageClass()
	 * @generated
	 */
	void setMessageClass(MessageClass value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(Publisher)
	 * @see notificationService.NotificationServicePackage#getQueueingService_Publisher()
	 * @model
	 * @generated
	 */
	Publisher getPublisher();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Publisher value);

	/**
	 * Returns the value of the '<em><b>Throttlingservice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link notificationService.ThrottlingService#getQueueingservice <em>Queueingservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throttlingservice</em>' reference.
	 * @see #setThrottlingservice(ThrottlingService)
	 * @see notificationService.NotificationServicePackage#getQueueingService_Throttlingservice()
	 * @see notificationService.ThrottlingService#getQueueingservice
	 * @model opposite="queueingservice"
	 * @generated
	 */
	ThrottlingService getThrottlingservice();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getThrottlingservice <em>Throttlingservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throttlingservice</em>' reference.
	 * @see #getThrottlingservice()
	 * @generated
	 */
	void setThrottlingservice(ThrottlingService value);

	/**
	 * Returns the value of the '<em><b>Ratelimiter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link notificationService.RateLimiter#getQueueingservice <em>Queueingservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratelimiter</em>' reference.
	 * @see #setRatelimiter(RateLimiter)
	 * @see notificationService.NotificationServicePackage#getQueueingService_Ratelimiter()
	 * @see notificationService.RateLimiter#getQueueingservice
	 * @model opposite="queueingservice"
	 * @generated
	 */
	RateLimiter getRatelimiter();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getRatelimiter <em>Ratelimiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratelimiter</em>' reference.
	 * @see #getRatelimiter()
	 * @generated
	 */
	void setRatelimiter(RateLimiter value);

	/**
	 * Returns the value of the '<em><b>Prioritizer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link notificationService.Prioritizer#getQueueingservice <em>Queueingservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prioritizer</em>' reference.
	 * @see #setPrioritizer(Prioritizer)
	 * @see notificationService.NotificationServicePackage#getQueueingService_Prioritizer()
	 * @see notificationService.Prioritizer#getQueueingservice
	 * @model opposite="queueingservice"
	 * @generated
	 */
	Prioritizer getPrioritizer();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getPrioritizer <em>Prioritizer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioritizer</em>' reference.
	 * @see #getPrioritizer()
	 * @generated
	 */
	void setPrioritizer(Prioritizer value);

	/**
	 * Returns the value of the '<em><b>Batch Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batch Number</em>' attribute.
	 * @see #setBatchNumber(char)
	 * @see notificationService.NotificationServicePackage#getQueueingService_BatchNumber()
	 * @model
	 * @generated
	 */
	char getBatchNumber();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getBatchNumber <em>Batch Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Number</em>' attribute.
	 * @see #getBatchNumber()
	 * @generated
	 */
	void setBatchNumber(char value);

	/**
	 * Returns the value of the '<em><b>Message Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Rate</em>' attribute.
	 * @see #setMessageRate(int)
	 * @see notificationService.NotificationServicePackage#getQueueingService_MessageRate()
	 * @model
	 * @generated
	 */
	int getMessageRate();

	/**
	 * Sets the value of the '{@link notificationService.QueueingService#getMessageRate <em>Message Rate</em>}' attribute.
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
	void publishMessage();

} // QueueingService
