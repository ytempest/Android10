/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.accounts;
/**
 * The interface used to return responses for asynchronous calls to the {@link IAccountManager}
 * @hide
 */
public interface IAccountManagerResponse extends android.os.IInterface
{
  /** Default implementation for IAccountManagerResponse. */
  public static class Default implements android.accounts.IAccountManagerResponse
  {
    @Override public void onResult(android.os.Bundle value) throws android.os.RemoteException
    {
    }
    @Override public void onError(int errorCode, java.lang.String errorMessage) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.accounts.IAccountManagerResponse
  {
    private static final java.lang.String DESCRIPTOR = "android.accounts.IAccountManagerResponse";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.accounts.IAccountManagerResponse interface,
     * generating a proxy if needed.
     */
    public static android.accounts.IAccountManagerResponse asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.accounts.IAccountManagerResponse))) {
        return ((android.accounts.IAccountManagerResponse)iin);
      }
      return new android.accounts.IAccountManagerResponse.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onResult:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onResult(_arg0);
          return true;
        }
        case TRANSACTION_onError:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onError(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.accounts.IAccountManagerResponse
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onResult(android.os.Bundle value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((value!=null)) {
            _data.writeInt(1);
            value.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onResult(value);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onError(int errorCode, java.lang.String errorMessage) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(errorCode);
          _data.writeString(errorMessage);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onError(errorCode, errorMessage);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static android.accounts.IAccountManagerResponse sDefaultImpl;
    }
    static final int TRANSACTION_onResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(android.accounts.IAccountManagerResponse impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static android.accounts.IAccountManagerResponse getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  @android.compat.annotation.UnsupportedAppUsage(overrideSourcePosition="D:\AndroidProject\AndroidSourceQ\frameworks\base\core\java\android\accounts\IAccountManagerResponse.aidl:25:1:25:25")
  public void onResult(android.os.Bundle value) throws android.os.RemoteException;
  @android.compat.annotation.UnsupportedAppUsage(overrideSourcePosition="D:\AndroidProject\AndroidSourceQ\frameworks\base\core\java\android\accounts\IAccountManagerResponse.aidl:27:1:27:25")
  public void onError(int errorCode, java.lang.String errorMessage) throws android.os.RemoteException;
}
