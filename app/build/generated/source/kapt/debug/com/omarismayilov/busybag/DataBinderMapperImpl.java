package com.omarismayilov.busybag;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.omarismayilov.busybag.databinding.FragmentAccountBindingImpl;
import com.omarismayilov.busybag.databinding.FragmentDetailBindingImpl;
import com.omarismayilov.busybag.databinding.FragmentEditAccountBindingImpl;
import com.omarismayilov.busybag.databinding.FragmentOfferProductBindingImpl;
import com.omarismayilov.busybag.databinding.FragmentProductListBindingImpl;
import com.omarismayilov.busybag.databinding.ItemCategoryBindingImpl;
import com.omarismayilov.busybag.databinding.ItemFavoriteBindingImpl;
import com.omarismayilov.busybag.databinding.ItemImageBindingImpl;
import com.omarismayilov.busybag.databinding.ItemOfferBindingImpl;
import com.omarismayilov.busybag.databinding.ItemPrimaryProductBindingImpl;
import com.omarismayilov.busybag.databinding.ItemProductBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTACCOUNT = 1;

  private static final int LAYOUT_FRAGMENTDETAIL = 2;

  private static final int LAYOUT_FRAGMENTEDITACCOUNT = 3;

  private static final int LAYOUT_FRAGMENTOFFERPRODUCT = 4;

  private static final int LAYOUT_FRAGMENTPRODUCTLIST = 5;

  private static final int LAYOUT_ITEMCATEGORY = 6;

  private static final int LAYOUT_ITEMFAVORITE = 7;

  private static final int LAYOUT_ITEMIMAGE = 8;

  private static final int LAYOUT_ITEMOFFER = 9;

  private static final int LAYOUT_ITEMPRIMARYPRODUCT = 10;

  private static final int LAYOUT_ITEMPRODUCT = 11;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(11);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.fragment_account, LAYOUT_FRAGMENTACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.fragment_edit_account, LAYOUT_FRAGMENTEDITACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.fragment_offer_product, LAYOUT_FRAGMENTOFFERPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.fragment_product_list, LAYOUT_FRAGMENTPRODUCTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.item_category, LAYOUT_ITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.item_favorite, LAYOUT_ITEMFAVORITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.item_image, LAYOUT_ITEMIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.item_offer, LAYOUT_ITEMOFFER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.item_primary_product, LAYOUT_ITEMPRIMARYPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.omarismayilov.busybag.R.layout.item_product, LAYOUT_ITEMPRODUCT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTACCOUNT: {
          if ("layout/fragment_account_0".equals(tag)) {
            return new FragmentAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITACCOUNT: {
          if ("layout/fragment_edit_account_0".equals(tag)) {
            return new FragmentEditAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_account is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTOFFERPRODUCT: {
          if ("layout/fragment_offer_product_0".equals(tag)) {
            return new FragmentOfferProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_offer_product is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTLIST: {
          if ("layout/fragment_product_list_0".equals(tag)) {
            return new FragmentProductListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORY: {
          if ("layout/item_category_0".equals(tag)) {
            return new ItemCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFAVORITE: {
          if ("layout/item_favorite_0".equals(tag)) {
            return new ItemFavoriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_favorite is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMIMAGE: {
          if ("layout/item_image_0".equals(tag)) {
            return new ItemImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_image is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMOFFER: {
          if ("layout/item_offer_0".equals(tag)) {
            return new ItemOfferBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_offer is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPRIMARYPRODUCT: {
          if ("layout/item_primary_product_0".equals(tag)) {
            return new ItemPrimaryProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_primary_product is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPRODUCT: {
          if ("layout/item_product_0".equals(tag)) {
            return new ItemProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_product is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "category");
      sKeys.put(2, "image");
      sKeys.put(3, "info");
      sKeys.put(4, "offer");
      sKeys.put(5, "product");
      sKeys.put(6, "user");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(11);

    static {
      sKeys.put("layout/fragment_account_0", com.omarismayilov.busybag.R.layout.fragment_account);
      sKeys.put("layout/fragment_detail_0", com.omarismayilov.busybag.R.layout.fragment_detail);
      sKeys.put("layout/fragment_edit_account_0", com.omarismayilov.busybag.R.layout.fragment_edit_account);
      sKeys.put("layout/fragment_offer_product_0", com.omarismayilov.busybag.R.layout.fragment_offer_product);
      sKeys.put("layout/fragment_product_list_0", com.omarismayilov.busybag.R.layout.fragment_product_list);
      sKeys.put("layout/item_category_0", com.omarismayilov.busybag.R.layout.item_category);
      sKeys.put("layout/item_favorite_0", com.omarismayilov.busybag.R.layout.item_favorite);
      sKeys.put("layout/item_image_0", com.omarismayilov.busybag.R.layout.item_image);
      sKeys.put("layout/item_offer_0", com.omarismayilov.busybag.R.layout.item_offer);
      sKeys.put("layout/item_primary_product_0", com.omarismayilov.busybag.R.layout.item_primary_product);
      sKeys.put("layout/item_product_0", com.omarismayilov.busybag.R.layout.item_product);
    }
  }
}
