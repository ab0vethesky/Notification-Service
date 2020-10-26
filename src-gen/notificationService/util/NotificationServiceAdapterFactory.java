/**
 */
package notificationService.util;

import notificationService.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see notificationService.NotificationServicePackage
 * @generated
 */
public class NotificationServiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NotificationServicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NotificationServicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationServiceSwitch<Adapter> modelSwitch = new NotificationServiceSwitch<Adapter>() {
		@Override
		public Adapter caseNotificationService(NotificationService object) {
			return createNotificationServiceAdapter();
		}

		@Override
		public Adapter caseQueueingService(QueueingService object) {
			return createQueueingServiceAdapter();
		}

		@Override
		public Adapter caseThrottlingService(ThrottlingService object) {
			return createThrottlingServiceAdapter();
		}

		@Override
		public Adapter casePublisher(Publisher object) {
			return createPublisherAdapter();
		}

		@Override
		public Adapter caseRateLimiter(RateLimiter object) {
			return createRateLimiterAdapter();
		}

		@Override
		public Adapter casePrioritizer(Prioritizer object) {
			return createPrioritizerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.NotificationService <em>Notification Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.NotificationService
	 * @generated
	 */
	public Adapter createNotificationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.QueueingService <em>Queueing Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.QueueingService
	 * @generated
	 */
	public Adapter createQueueingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.ThrottlingService <em>Throttling Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.ThrottlingService
	 * @generated
	 */
	public Adapter createThrottlingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.Publisher
	 * @generated
	 */
	public Adapter createPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.RateLimiter <em>Rate Limiter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.RateLimiter
	 * @generated
	 */
	public Adapter createRateLimiterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link notificationService.Prioritizer <em>Prioritizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see notificationService.Prioritizer
	 * @generated
	 */
	public Adapter createPrioritizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NotificationServiceAdapterFactory
