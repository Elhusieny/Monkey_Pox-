// Generated by data binding compiler. Do not edit!
package com.example.monkeypoxwithfragment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.monkeypoxwithfragment.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentApplyAsADoctorBinding extends ViewDataBinding {
  @NonNull
  public final TextView ApplyAsadoctorClick;

  @NonNull
  public final EditText DrName;

  @NonNull
  public final EditText Email;

  @NonNull
  public final EditText Governorate;

  @NonNull
  public final TextView HomeClick;

  @NonNull
  public final Spinner country;

  @NonNull
  public final RelativeLayout heade;

  @NonNull
  public final ImageView icArrowRight;

  @NonNull
  public final ImageView icHome;

  @NonNull
  public final ImageView imagemedicalsyndicate;

  @NonNull
  public final EditText selectCertificate;

  @NonNull
  public final ImageView selectImg;

  @NonNull
  public final EditText shortreview;

  @NonNull
  public final Spinner spGender;

  @NonNull
  public final Button submitButton;

  @NonNull
  public final EditText syndicateNumber;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final ImageView top;

  protected FragmentApplyAsADoctorBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView ApplyAsadoctorClick, EditText DrName, EditText Email,
      EditText Governorate, TextView HomeClick, Spinner country, RelativeLayout heade,
      ImageView icArrowRight, ImageView icHome, ImageView imagemedicalsyndicate,
      EditText selectCertificate, ImageView selectImg, EditText shortreview, Spinner spGender,
      Button submitButton, EditText syndicateNumber, TextView textView1, TextView textView2,
      TextView textView3, TextView textView4, TextView textView5, TextView textView6,
      TextView textView7, TextView textView8, TextView textView9, ImageView top) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ApplyAsadoctorClick = ApplyAsadoctorClick;
    this.DrName = DrName;
    this.Email = Email;
    this.Governorate = Governorate;
    this.HomeClick = HomeClick;
    this.country = country;
    this.heade = heade;
    this.icArrowRight = icArrowRight;
    this.icHome = icHome;
    this.imagemedicalsyndicate = imagemedicalsyndicate;
    this.selectCertificate = selectCertificate;
    this.selectImg = selectImg;
    this.shortreview = shortreview;
    this.spGender = spGender;
    this.submitButton = submitButton;
    this.syndicateNumber = syndicateNumber;
    this.textView1 = textView1;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.textView9 = textView9;
    this.top = top;
  }

  @NonNull
  public static FragmentApplyAsADoctorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_apply_as_a_doctor, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentApplyAsADoctorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentApplyAsADoctorBinding>inflateInternal(inflater, R.layout.fragment_apply_as_a_doctor, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentApplyAsADoctorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_apply_as_a_doctor, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentApplyAsADoctorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentApplyAsADoctorBinding>inflateInternal(inflater, R.layout.fragment_apply_as_a_doctor, null, false, component);
  }

  public static FragmentApplyAsADoctorBinding bind(@NonNull View view) {
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
  public static FragmentApplyAsADoctorBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentApplyAsADoctorBinding)bind(component, view, R.layout.fragment_apply_as_a_doctor);
  }
}
