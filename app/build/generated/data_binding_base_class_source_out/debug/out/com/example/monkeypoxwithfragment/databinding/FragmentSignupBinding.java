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

public abstract class FragmentSignupBinding extends ViewDataBinding {
  @NonNull
  public final TextView HomeClick;

  @NonNull
  public final Button RegisterBtn;

  @NonNull
  public final TextView contactUsClick;

  @NonNull
  public final RelativeLayout heade;

  @NonNull
  public final ImageView icArrowRight;

  @NonNull
  public final ImageView icHome;

  @NonNull
  public final Spinner spCountryName;

  @NonNull
  public final ImageView top;

  @NonNull
  public final EditText txtemail;

  @NonNull
  public final EditText txtname;

  @NonNull
  public final EditText txtpassword;

  @NonNull
  public final EditText txtpasswordconfirmation;

  protected FragmentSignupBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView HomeClick, Button RegisterBtn, TextView contactUsClick, RelativeLayout heade,
      ImageView icArrowRight, ImageView icHome, Spinner spCountryName, ImageView top,
      EditText txtemail, EditText txtname, EditText txtpassword, EditText txtpasswordconfirmation) {
    super(_bindingComponent, _root, _localFieldCount);
    this.HomeClick = HomeClick;
    this.RegisterBtn = RegisterBtn;
    this.contactUsClick = contactUsClick;
    this.heade = heade;
    this.icArrowRight = icArrowRight;
    this.icHome = icHome;
    this.spCountryName = spCountryName;
    this.top = top;
    this.txtemail = txtemail;
    this.txtname = txtname;
    this.txtpassword = txtpassword;
    this.txtpasswordconfirmation = txtpasswordconfirmation;
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_signup, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSignupBinding>inflateInternal(inflater, R.layout.fragment_signup, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_signup, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSignupBinding>inflateInternal(inflater, R.layout.fragment_signup, null, false, component);
  }

  public static FragmentSignupBinding bind(@NonNull View view) {
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
  public static FragmentSignupBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSignupBinding)bind(component, view, R.layout.fragment_signup);
  }
}
