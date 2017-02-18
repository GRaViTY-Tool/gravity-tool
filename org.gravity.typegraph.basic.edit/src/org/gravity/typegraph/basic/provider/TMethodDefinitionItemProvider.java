/**
 */
package org.gravity.typegraph.basic.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * This is the item provider adapter for a {@link org.gravity.typegraph.basic.TMethodDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TMethodDefinitionItemProvider extends TMemberItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMethodDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOverridingPropertyDescriptor(object);
			addOverriddenByPropertyDescriptor(object);
			addOverloadingPropertyDescriptor(object);
			addOverloadedByPropertyDescriptor(object);
			addReturnTypePropertyDescriptor(object);
			addTMethodEntityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Overriding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverridingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TMethodDefinition_overriding_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TMethodDefinition_overriding_feature",
								"_UI_TMethodDefinition_type"),
						BasicPackage.Literals.TMETHOD_DEFINITION__OVERRIDING, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Overridden By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverriddenByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TMethodDefinition_overriddenBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TMethodDefinition_overriddenBy_feature",
								"_UI_TMethodDefinition_type"),
						BasicPackage.Literals.TMETHOD_DEFINITION__OVERRIDDEN_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Overloading feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverloadingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TMethodDefinition_overloading_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TMethodDefinition_overloading_feature",
								"_UI_TMethodDefinition_type"),
						BasicPackage.Literals.TMETHOD_DEFINITION__OVERLOADING, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Overloaded By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverloadedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TMethodDefinition_overloadedBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TMethodDefinition_overloadedBy_feature",
								"_UI_TMethodDefinition_type"),
						BasicPackage.Literals.TMETHOD_DEFINITION__OVERLOADED_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Return Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TMethodDefinition_returnType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TMethodDefinition_returnType_feature",
								"_UI_TMethodDefinition_type"),
						BasicPackage.Literals.TMETHOD_DEFINITION__RETURN_TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the TMethod Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTMethodEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TMethodDefinition_tMethodEntity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TMethodDefinition_tMethodEntity_feature",
								"_UI_TMethodDefinition_type"),
						BasicPackage.Literals.TMETHOD_DEFINITION__TMETHOD_ENTITY, true, false, true, null, null, null));
	}

	/**
	 * This returns TMethodDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TMethodDefinition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TMethodDefinition_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
