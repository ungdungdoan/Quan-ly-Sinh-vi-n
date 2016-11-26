
/**
 * App_ModelCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package sm_app.com;

    /**
     *  App_ModelCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class App_ModelCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public App_ModelCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public App_ModelCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for ktDangNhap method
            * override this method for handling normal response from ktDangNhap operation
            */
           public void receiveResultktDangNhap(
                    sm_app.com.App_ModelStub.KtDangNhapResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from ktDangNhap operation
           */
            public void receiveErrorktDangNhap(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for xuatDSSV method
            * override this method for handling normal response from xuatDSSV operation
            */
           public void receiveResultxuatDSSV(
                    sm_app.com.App_ModelStub.XuatDSSVResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from xuatDSSV operation
           */
            public void receiveErrorxuatDSSV(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for timSV method
            * override this method for handling normal response from timSV operation
            */
           public void receiveResulttimSV(
                    sm_app.com.App_ModelStub.TimSVResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from timSV operation
           */
            public void receiveErrortimSV(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for xoaSinhVien method
            * override this method for handling normal response from xoaSinhVien operation
            */
           public void receiveResultxoaSinhVien(
                    sm_app.com.App_ModelStub.XoaSinhVienResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from xoaSinhVien operation
           */
            public void receiveErrorxoaSinhVien(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for xuatDSL method
            * override this method for handling normal response from xuatDSL operation
            */
           public void receiveResultxuatDSL(
                    sm_app.com.App_ModelStub.XuatDSLResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from xuatDSL operation
           */
            public void receiveErrorxuatDSL(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for danhsachLop method
            * override this method for handling normal response from danhsachLop operation
            */
           public void receiveResultdanhsachLop(
                    sm_app.com.App_ModelStub.DanhsachLopResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from danhsachLop operation
           */
            public void receiveErrordanhsachLop(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for themSinhVien method
            * override this method for handling normal response from themSinhVien operation
            */
           public void receiveResultthemSinhVien(
                    sm_app.com.App_ModelStub.ThemSinhVienResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from themSinhVien operation
           */
            public void receiveErrorthemSinhVien(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for suaTTSV method
            * override this method for handling normal response from suaTTSV operation
            */
           public void receiveResultsuaTTSV(
                    sm_app.com.App_ModelStub.SuaTTSVResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from suaTTSV operation
           */
            public void receiveErrorsuaTTSV(java.lang.Exception e) {
            }
                


    }
    