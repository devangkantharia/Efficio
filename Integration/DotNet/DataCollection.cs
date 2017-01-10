//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.10
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace Efficio.Net {

public class DataCollection : global::System.IDisposable, global::System.Collections.IEnumerable
    , global::System.Collections.Generic.IEnumerable<Data>
 {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal DataCollection(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(DataCollection obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~DataCollection() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioRuntimePINVOKE.delete_DataCollection(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public DataCollection(global::System.Collections.ICollection c) : this() {
    if (c == null)
      throw new global::System.ArgumentNullException("c");
    foreach (Data element in c) {
      this.Add(element);
    }
  }

  public bool IsFixedSize {
    get {
      return false;
    }
  }

  public bool IsReadOnly {
    get {
      return false;
    }
  }

  public Data this[int index]  {
    get {
      return getitem(index);
    }
    set {
      setitem(index, value);
    }
  }

  public int Capacity {
    get {
      return (int)capacity();
    }
    set {
      if (value < size())
        throw new global::System.ArgumentOutOfRangeException("Capacity");
      reserve((uint)value);
    }
  }

  public int Count {
    get {
      return (int)size();
    }
  }

  public bool IsSynchronized {
    get {
      return false;
    }
  }

  public void CopyTo(Data[] array)
  {
    CopyTo(0, array, 0, this.Count);
  }

  public void CopyTo(Data[] array, int arrayIndex)
  {
    CopyTo(0, array, arrayIndex, this.Count);
  }

  public void CopyTo(int index, Data[] array, int arrayIndex, int count)
  {
    if (array == null)
      throw new global::System.ArgumentNullException("array");
    if (index < 0)
      throw new global::System.ArgumentOutOfRangeException("index", "Value is less than zero");
    if (arrayIndex < 0)
      throw new global::System.ArgumentOutOfRangeException("arrayIndex", "Value is less than zero");
    if (count < 0)
      throw new global::System.ArgumentOutOfRangeException("count", "Value is less than zero");
    if (array.Rank > 1)
      throw new global::System.ArgumentException("Multi dimensional array.", "array");
    if (index+count > this.Count || arrayIndex+count > array.Length)
      throw new global::System.ArgumentException("Number of elements to copy is too large.");
    for (int i=0; i<count; i++)
      array.SetValue(getitemcopy(index+i), arrayIndex+i);
  }

  global::System.Collections.Generic.IEnumerator<Data> global::System.Collections.Generic.IEnumerable<Data>.GetEnumerator() {
    return new DataCollectionEnumerator(this);
  }

  global::System.Collections.IEnumerator global::System.Collections.IEnumerable.GetEnumerator() {
    return new DataCollectionEnumerator(this);
  }

  public DataCollectionEnumerator GetEnumerator() {
    return new DataCollectionEnumerator(this);
  }

  // Type-safe enumerator
  /// Note that the IEnumerator documentation requires an InvalidOperationException to be thrown
  /// whenever the collection is modified. This has been done for changes in the size of the
  /// collection but not when one of the elements of the collection is modified as it is a bit
  /// tricky to detect unmanaged code that modifies the collection under our feet.
  public sealed class DataCollectionEnumerator : global::System.Collections.IEnumerator
    , global::System.Collections.Generic.IEnumerator<Data>
  {
    private DataCollection collectionRef;
    private int currentIndex;
    private object currentObject;
    private int currentSize;

    public DataCollectionEnumerator(DataCollection collection) {
      collectionRef = collection;
      currentIndex = -1;
      currentObject = null;
      currentSize = collectionRef.Count;
    }

    // Type-safe iterator Current
    public Data Current {
      get {
        if (currentIndex == -1)
          throw new global::System.InvalidOperationException("Enumeration not started.");
        if (currentIndex > currentSize - 1)
          throw new global::System.InvalidOperationException("Enumeration finished.");
        if (currentObject == null)
          throw new global::System.InvalidOperationException("Collection modified.");
        return (Data)currentObject;
      }
    }

    // Type-unsafe IEnumerator.Current
    object global::System.Collections.IEnumerator.Current {
      get {
        return Current;
      }
    }

    public bool MoveNext() {
      int size = collectionRef.Count;
      bool moveOkay = (currentIndex+1 < size) && (size == currentSize);
      if (moveOkay) {
        currentIndex++;
        currentObject = collectionRef[currentIndex];
      } else {
        currentObject = null;
      }
      return moveOkay;
    }

    public void Reset() {
      currentIndex = -1;
      currentObject = null;
      if (collectionRef.Count != currentSize) {
        throw new global::System.InvalidOperationException("Collection modified.");
      }
    }

    public void Dispose() {
        currentIndex = -1;
        currentObject = null;
    }
  }

  public void Clear() {
    EfficioRuntimePINVOKE.DataCollection_Clear(swigCPtr);
  }

  public void Add(Data x) {
    EfficioRuntimePINVOKE.DataCollection_Add(swigCPtr, Data.getCPtr(x));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  private uint size() {
    uint ret = EfficioRuntimePINVOKE.DataCollection_size(swigCPtr);
    return ret;
  }

  private uint capacity() {
    uint ret = EfficioRuntimePINVOKE.DataCollection_capacity(swigCPtr);
    return ret;
  }

  private void reserve(uint n) {
    EfficioRuntimePINVOKE.DataCollection_reserve(swigCPtr, n);
  }

  public DataCollection() : this(EfficioRuntimePINVOKE.new_DataCollection__SWIG_0(), true) {
  }

  public DataCollection(DataCollection other) : this(EfficioRuntimePINVOKE.new_DataCollection__SWIG_1(DataCollection.getCPtr(other)), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public DataCollection(int capacity) : this(EfficioRuntimePINVOKE.new_DataCollection__SWIG_2(capacity), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  private Data getitemcopy(int index) {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.DataCollection_getitemcopy(swigCPtr, index);
    Data ret = (cPtr == global::System.IntPtr.Zero) ? null : new Data(cPtr, true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  private Data getitem(int index) {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.DataCollection_getitem(swigCPtr, index);
    Data ret = (cPtr == global::System.IntPtr.Zero) ? null : new Data(cPtr, true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  private void setitem(int index, Data val) {
    EfficioRuntimePINVOKE.DataCollection_setitem(swigCPtr, index, Data.getCPtr(val));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void AddRange(DataCollection values) {
    EfficioRuntimePINVOKE.DataCollection_AddRange(swigCPtr, DataCollection.getCPtr(values));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public DataCollection GetRange(int index, int count) {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.DataCollection_GetRange(swigCPtr, index, count);
    DataCollection ret = (cPtr == global::System.IntPtr.Zero) ? null : new DataCollection(cPtr, true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void Insert(int index, Data x) {
    EfficioRuntimePINVOKE.DataCollection_Insert(swigCPtr, index, Data.getCPtr(x));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void InsertRange(int index, DataCollection values) {
    EfficioRuntimePINVOKE.DataCollection_InsertRange(swigCPtr, index, DataCollection.getCPtr(values));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void RemoveAt(int index) {
    EfficioRuntimePINVOKE.DataCollection_RemoveAt(swigCPtr, index);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void RemoveRange(int index, int count) {
    EfficioRuntimePINVOKE.DataCollection_RemoveRange(swigCPtr, index, count);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public static DataCollection Repeat(Data value, int count) {
    global::System.IntPtr cPtr = EfficioRuntimePINVOKE.DataCollection_Repeat(Data.getCPtr(value), count);
    DataCollection ret = (cPtr == global::System.IntPtr.Zero) ? null : new DataCollection(cPtr, true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void Reverse() {
    EfficioRuntimePINVOKE.DataCollection_Reverse__SWIG_0(swigCPtr);
  }

  public void Reverse(int index, int count) {
    EfficioRuntimePINVOKE.DataCollection_Reverse__SWIG_1(swigCPtr, index, count);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public void SetRange(int index, DataCollection values) {
    EfficioRuntimePINVOKE.DataCollection_SetRange(swigCPtr, index, DataCollection.getCPtr(values));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

}

}