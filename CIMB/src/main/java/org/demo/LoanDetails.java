package org.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class LoanDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String remarks;
   private java.lang.String reason;
   private java.lang.Integer amount;
   private java.lang.Integer duration;
   private java.lang.Float rate;

   public LoanDetails()
   {
   }

   public java.lang.String getRemarks()
   {
      return this.remarks;
   }

   public void setRemarks(java.lang.String remarks)
   {
      this.remarks = remarks;
   }

   public java.lang.String getReason()
   {
      return this.reason;
   }

   public void setReason(java.lang.String reason)
   {
      this.reason = reason;
   }

   public java.lang.Integer getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Integer amount)
   {
      this.amount = amount;
   }

   public java.lang.Integer getDuration()
   {
      return this.duration;
   }

   public void setDuration(java.lang.Integer duration)
   {
      this.duration = duration;
   }

   public java.lang.Float getRate()
   {
      return this.rate;
   }

   public void setRate(java.lang.Float rate)
   {
      this.rate = rate;
   }

   public LoanDetails(java.lang.String remarks, java.lang.String reason,
         java.lang.Integer amount, java.lang.Integer duration,
         java.lang.Float rate)
   {
      this.remarks = remarks;
      this.reason = reason;
      this.amount = amount;
      this.duration = duration;
      this.rate = rate;
   }

}