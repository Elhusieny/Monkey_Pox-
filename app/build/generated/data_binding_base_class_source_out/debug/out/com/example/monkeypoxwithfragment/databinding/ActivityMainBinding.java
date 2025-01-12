// Generated by data binding compiler. Do not edit!
package com.example.monkeypoxwithfragment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import com.example.monkeypoxwithfragment.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final TextView contactUCI;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final ImageView facebookImg;

  @NonNull
  public final FragmentContainerView fragmentContainer;

  @NonNull
  public final ImageView googleImg;

  @NonNull
  public final ImageView instaImg;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final TextView monkeyLogoTxt;

  @NonNull
  public final NavigationView navView;

  @NonNull
  public final ImageView recImg;

  @NonNull
  public final ImageView recImg2;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final ImageView twitterImg;

  @NonNull
  public final TextView txtAbout;

  @NonNull
  public final TextView txtContact;

  @NonNull
  public final TextView txtDate;

  @NonNull
  public final TextView txtDate2;

  @NonNull
  public final TextView txtDiagnosis;

  @NonNull
  public final TextView txtDoctors;

  @NonNull
  public final TextView txtFaqs;

  @NonNull
  public final TextView txtHistory;

  @NonNull
  public final TextView txtHome;

  @NonNull
  public final TextView txtLocation;

  @NonNull
  public final TextView txtMail;

  @NonNull
  public final TextView txtNews;

  @NonNull
  public final TextView txtOur;

  @NonNull
  public final TextView txtPhone;

  @NonNull
  public final TextView txtPrev;

  @NonNull
  public final TextView txtRecentPost;

  @NonNull
  public final TextView txtRecentPost2;

  @NonNull
  public final TextView txtRecentPosts;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView contactUCI, DrawerLayout drawerLayout, ImageView facebookImg,
      FragmentContainerView fragmentContainer, ImageView googleImg, ImageView instaImg,
      ImageView logo, TextView monkeyLogoTxt, NavigationView navView, ImageView recImg,
      ImageView recImg2, Toolbar toolbar, ImageView twitterImg, TextView txtAbout,
      TextView txtContact, TextView txtDate, TextView txtDate2, TextView txtDiagnosis,
      TextView txtDoctors, TextView txtFaqs, TextView txtHistory, TextView txtHome,
      TextView txtLocation, TextView txtMail, TextView txtNews, TextView txtOur, TextView txtPhone,
      TextView txtPrev, TextView txtRecentPost, TextView txtRecentPost2, TextView txtRecentPosts) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contactUCI = contactUCI;
    this.drawerLayout = drawerLayout;
    this.facebookImg = facebookImg;
    this.fragmentContainer = fragmentContainer;
    this.googleImg = googleImg;
    this.instaImg = instaImg;
    this.logo = logo;
    this.monkeyLogoTxt = monkeyLogoTxt;
    this.navView = navView;
    this.recImg = recImg;
    this.recImg2 = recImg2;
    this.toolbar = toolbar;
    this.twitterImg = twitterImg;
    this.txtAbout = txtAbout;
    this.txtContact = txtContact;
    this.txtDate = txtDate;
    this.txtDate2 = txtDate2;
    this.txtDiagnosis = txtDiagnosis;
    this.txtDoctors = txtDoctors;
    this.txtFaqs = txtFaqs;
    this.txtHistory = txtHistory;
    this.txtHome = txtHome;
    this.txtLocation = txtLocation;
    this.txtMail = txtMail;
    this.txtNews = txtNews;
    this.txtOur = txtOur;
    this.txtPhone = txtPhone;
    this.txtPrev = txtPrev;
    this.txtRecentPost = txtRecentPost;
    this.txtRecentPost2 = txtRecentPost2;
    this.txtRecentPosts = txtRecentPosts;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
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
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
