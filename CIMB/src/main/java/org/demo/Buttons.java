package org.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Buttons implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Boolean approve;
   private java.lang.Boolean reject;
   private java.lang.Boolean rework;
   private java.lang.Boolean cancel;

   public Buttons()
   {
   }

   public java.lang.Boolean getApprove()
   {
      return this.approve;
   }

   public void setApprove(java.lang.Boolean approve)
   {
      this.approve = approve;
   }

   public java.lang.Boolean getReject()
   {
      return this.reject;
   }

   public void setReject(java.lang.Boolean reject)
   {
      this.reject = reject;
   }

   public java.lang.Boolean getRework()
   {
      return this.rework;
   }

   public void setRework(java.lang.Boolean rework)
   {
      this.rework = rework;
   }

   public java.lang.Boolean getCancel()
   {
      return this.cancel;
   }

   public void setCancel(java.lang.Boolean cancel)
   {
      this.cancel = cancel;
   }

   public Buttons(java.lang.Boolean approve, java.lang.Boolean reject,
         java.lang.Boolean rework, java.lang.Boolean cancel)
   {
      this.approve = approve;
      this.reject = reject;
      this.rework = rework;
      this.cancel = cancel;
   }

}