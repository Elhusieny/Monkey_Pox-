// Generated by data binding compiler. Do not edit!
package com.example.monkeypoxwithfragment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.monkeypoxwithfragment.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDoctorDataViewBinding extends ViewDataBinding {
  @NonNull
  public final TextView NameTV;

  @NonNull
  public final TextView WorhhoursTV1;

  @NonNull
  public final TextView WorhhoursTV2;

  @NonNull
  public final TextView WorhhoursTV3;

  @NonNull
  public final TextView WorhhoursTV4;

  @NonNull
  public final TextView WorhhoursTV5;

  @NonNull
  public final TextView WorhhoursTV6;

  @NonNull
  public final TextView WorkHours;

  @NonNull
  public final TextView callus;

  @NonNull
  public final TextView descriptionTV;

  @NonNull
  public final TextView detailsTV;

  @NonNull
  public final ImageView drImg;

  @NonNull
  public final TextView txtcontactphone;

  @NonNull
  public final TextView txtmail;

  protected FragmentDoctorDataViewBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView NameTV, TextView WorhhoursTV1, TextView WorhhoursTV2,
      TextView WorhhoursTV3, TextView WorhhoursTV4, TextView WorhhoursTV5, TextView WorhhoursTV6,
      TextView WorkHours, TextView callus, TextView descriptionTV, TextView detailsTV,
      ImageView drImg, TextView txtcontactphone, TextView txtmail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.NameTV = NameTV;
    this.WorhhoursTV1 = WorhhoursTV1;
    this.WorhhoursTV2 = WorhhoursTV2;
    this.WorhhoursTV3 = WorhhoursTV3;
    this.WorhhoursTV4 = WorhhoursTV4;
    this.WorhhoursTV5 = WorhhoursTV5;
    this.WorhhoursTV6 = WorhhoursTV6;
    this.WorkHours = WorkHours;
    this.callus = callus;
    this.descriptionTV = descriptionTV;
    this.detailsTV = detailsTV;
    this.drImg = drImg;
    this.txtcontactphone = txtcontactphone;
    this.txtmail = txtmail;
  }

  @NonNull
  public static FragmentDoctorDataViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_doctor_data_view, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDoctorDataViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDoctorDataViewBinding>inflateInternal(inflater, R.layout.fragment_doctor_data_view, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDoctorDataViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_doctor_data_view, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDoctorDataViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDoctorDataViewBinding>inflateInternal(inflater, R.layout.fragment_doctor_data_view, null, false, component);
  }

  public static FragmentDoctorDataViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentDoctorDataViewBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDoctorDataViewBinding)bind(component, view, R.layout.fragment_doctor_data_view);
  }
}
