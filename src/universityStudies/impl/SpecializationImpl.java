/**
 */
package universityStudies.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import universityStudies.Course;
import universityStudies.Specialization;
import universityStudies.UniversityStudiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link universityStudies.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link universityStudies.impl.SpecializationImpl#getFurtherSpecializations <em>Further Specializations</em>}</li>
 *   <li>{@link universityStudies.impl.SpecializationImpl#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFurtherSpecializations() <em>Further Specializations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurtherSpecializations()
	 * @generated
	 * @ordered
	 */
	protected Specialization furtherSpecializations;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityStudiesPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization getFurtherSpecializations() {
		if (furtherSpecializations != null && furtherSpecializations.eIsProxy()) {
			InternalEObject oldFurtherSpecializations = (InternalEObject)furtherSpecializations;
			furtherSpecializations = (Specialization)eResolveProxy(oldFurtherSpecializations);
			if (furtherSpecializations != oldFurtherSpecializations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityStudiesPackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS, oldFurtherSpecializations, furtherSpecializations));
			}
		}
		return furtherSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetFurtherSpecializations() {
		return furtherSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFurtherSpecializations(Specialization newFurtherSpecializations) {
		Specialization oldFurtherSpecializations = furtherSpecializations;
		furtherSpecializations = newFurtherSpecializations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityStudiesPackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS, oldFurtherSpecializations, furtherSpecializations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, UniversityStudiesPackage.SPECIALIZATION__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityStudiesPackage.SPECIALIZATION__NAME:
				return getName();
			case UniversityStudiesPackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				if (resolve) return getFurtherSpecializations();
				return basicGetFurtherSpecializations();
			case UniversityStudiesPackage.SPECIALIZATION__COURSES:
				return getCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityStudiesPackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case UniversityStudiesPackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				setFurtherSpecializations((Specialization)newValue);
				return;
			case UniversityStudiesPackage.SPECIALIZATION__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniversityStudiesPackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniversityStudiesPackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				setFurtherSpecializations((Specialization)null);
				return;
			case UniversityStudiesPackage.SPECIALIZATION__COURSES:
				getCourses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniversityStudiesPackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UniversityStudiesPackage.SPECIALIZATION__FURTHER_SPECIALIZATIONS:
				return furtherSpecializations != null;
			case UniversityStudiesPackage.SPECIALIZATION__COURSES:
				return courses != null && !courses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl