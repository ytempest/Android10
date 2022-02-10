/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.service.euicc;
/** @hide */
public interface IGetDownloadableSubscriptionMetadataCallback extends android.os.IInterface
{
  /** Default implementation for IGetDownloadableSubscriptionMetadataCallback. */
  public static class Default implements android.service.euicc.IGetDownloadableSubscriptionMetadataCallback
  {
    @Override public void onComplete(android.service.euicc.GetDownloadableSubscriptionMetadataResult result) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.service.euicc.IGetDownloadableSubscriptionMetadataCallback
  {
    private static final java.lang.String DESCRIPTOR = "android.service.euicc.IGetDownloadableSubscriptionMetadataCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.service.euicc.IGetDownloadableSubscriptionMetadataCallback interface,
     * generating a proxy if needed.
     */
    public static android.service.euicc.IGetDownloadableSubscriptionMetadataCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.service.euicc.IGetDownloadableSubscriptionMetadataCallback))) {
        return ((android.service.euicc.IGetDownloadableSubscriptionMetadataCallback)iin);
      }
      return new android.service.euicc.IGetDownloadableSubscriptionMetadataCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onComplete:
        {
          data.enforceInterface(descriptor);
          android.service.euicc.GetDownloadableSubscriptionMetadataResult _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.service.euicc.GetDownloadableSubscriptionMetadataResult.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onComplete(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.service.euicc.IGetDownloadableSubscriptionMetadataCallback
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
      @Override public void onComplete(android.service.euicc.GetDownloadableSubscriptionMetadataResult result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((result!=null)) {
            _data.writeInt(1);
            result.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onComplete(result);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static android.service.euicc.IGetDownloadableSubscriptionMetadataCallback sDefaultImpl;
    }
    static final int TRANSACTION_onComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(android.service.euicc.IGetDownloadableSubscriptionMetadataCallback impl) {
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
    public static android.service.euicc.IGetDownloadableSubscriptionMetadataCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  @android.compat.annotation.UnsupportedAppUsage(overrideSourcePosition="D:\AndroidProject\AndroidSourceQ\frameworks\base\core\java\android\service\euicc\IGetDownloadableSubscriptionMetadataCallback.aidl:23:1:23:25")
  public void onComplete(android.service.euicc.GetDownloadableSubscriptionMetadataResult result) throws android.os.RemoteException;
}
