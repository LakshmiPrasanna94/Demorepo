package org.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RequestType implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Boolean newLoan;

   private java.lang.Boolean existingLoan;

   private java.lang.Boolean other;

   public RequestType()
   {
   }

   public java.lang.Boolean getNewLoan()
   {
      return this.newLoan;
   }

   public void setNewLoan(java.lang.Boolean newLoan)
   {
      this.newLoan = newLoan;
   }

   public java.lang.Boolean getExistingLoan()
   {
      return this.existingLoan;
   }

   public void setExistingLoan(java.lang.Boolean existingLoan)
   {
      this.existingLoan = existingLoan;
   }

   public java.lang.Boolean getOther()
   {
      return this.other;
   }

   public void setOther(java.lang.Boolean other)
   {
      this.other = other;
   }

   public RequestType(java.lang.Boolean newLoan, java.lang.Boolean existingLoan,
         java.lang.Boolean other)
   {
      this.newLoan = newLoan;
      this.existingLoan = existingLoan;
      this.other = other;
   }

}