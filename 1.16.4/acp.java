/*    */ import com.google.gson.JsonObject;
/*    */ import java.text.ParseException;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class acp<T>
/*    */   extends acx<T>
/*    */ {
/* 12 */   public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
/*    */   
/*    */   protected final Date b;
/*    */   
/*    */   protected final String c;
/*    */   protected final Date d;
/*    */   protected final String e;
/*    */   
/*    */   public acp(T ☃, @Nullable Date date1, @Nullable String str1, @Nullable Date date2, @Nullable String str2) {
/* 21 */     super(☃);
/* 22 */     this.b = (date1 == null) ? new Date() : date1;
/* 23 */     this.c = (str1 == null) ? "(Unknown)" : str1;
/* 24 */     this.d = date2;
/* 25 */     this.e = (str2 == null) ? "Banned by an operator." : str2;
/*    */   }
/*    */   
/*    */   protected acp(T ☃, JsonObject jsonObject) {
/* 29 */     super(☃);
/*    */     Date date1, date2;
/*    */     try {
/* 32 */       date1 = jsonObject.has("created") ? a.parse(jsonObject.get("created").getAsString()) : new Date();
/* 33 */     } catch (ParseException parseException) {
/* 34 */       date1 = new Date();
/*    */     } 
/* 36 */     this.b = date1;
/* 37 */     this.c = jsonObject.has("source") ? jsonObject.get("source").getAsString() : "(Unknown)";
/*    */     
/*    */     try {
/* 40 */       date2 = jsonObject.has("expires") ? a.parse(jsonObject.get("expires").getAsString()) : null;
/* 41 */     } catch (ParseException parseException) {
/* 42 */       date2 = null;
/*    */     } 
/* 44 */     this.d = date2;
/* 45 */     this.e = jsonObject.has("reason") ? jsonObject.get("reason").getAsString() : "Banned by an operator.";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String b() {
/* 53 */     return this.c;
/*    */   }
/*    */   
/*    */   public Date c() {
/* 57 */     return this.d;
/*    */   }
/*    */   
/*    */   public String d() {
/* 61 */     return this.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public abstract nr e();
/*    */   
/*    */   boolean f() {
/* 68 */     if (this.d == null) {
/* 69 */       return false;
/*    */     }
/* 71 */     return this.d.before(new Date());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(JsonObject ☃) {
/* 76 */     ☃.addProperty("created", a.format(this.b));
/* 77 */     ☃.addProperty("source", this.c);
/* 78 */     ☃.addProperty("expires", (this.d == null) ? "forever" : a.format(this.d));
/* 79 */     ☃.addProperty("reason", this.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */