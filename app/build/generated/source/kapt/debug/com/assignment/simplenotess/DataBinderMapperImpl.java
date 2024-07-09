package com.assignment.simplenotess;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.assignment.simplenotess.databinding.FragmentLoginBindingImpl;
import com.assignment.simplenotess.databinding.FragmentNotesBindingImpl;
import com.assignment.simplenotess.databinding.FragmentNotesListBindingImpl;
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
  private static final int LAYOUT_FRAGMENTLOGIN = 1;

  private static final int LAYOUT_FRAGMENTNOTES = 2;

  private static final int LAYOUT_FRAGMENTNOTESLIST = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.assignment.simplenotess.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.assignment.simplenotess.R.layout.fragment_notes, LAYOUT_FRAGMENTNOTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.assignment.simplenotess.R.layout.fragment_notes_list, LAYOUT_FRAGMENTNOTESLIST);
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
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTES: {
          if ("layout/fragment_notes_0".equals(tag)) {
            return new FragmentNotesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_notes is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNOTESLIST: {
          if ("layout/fragment_notes_list_0".equals(tag)) {
            return new FragmentNotesListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_notes_list is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_login_0", com.assignment.simplenotess.R.layout.fragment_login);
      sKeys.put("layout/fragment_notes_0", com.assignment.simplenotess.R.layout.fragment_notes);
      sKeys.put("layout/fragment_notes_list_0", com.assignment.simplenotess.R.layout.fragment_notes_list);
    }
  }
}
