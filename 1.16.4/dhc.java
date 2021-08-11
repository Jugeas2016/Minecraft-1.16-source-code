/*    */ import com.google.gson.annotations.SerializedName;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Modifier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class dhc
/*    */ {
/*    */   public String toString() {
/* 11 */     StringBuilder ☃ = new StringBuilder("{");
/* 12 */     for (Field field : getClass().getFields()) {
/* 13 */       if (!b(field)) {
/*    */         try {
/* 15 */           ☃.append(a(field)).append("=").append(field.get(this)).append(" ");
/* 16 */         } catch (IllegalAccessException illegalAccessException) {}
/*    */       }
/*    */     } 
/*    */     
/* 20 */     ☃.deleteCharAt(☃.length() - 1);
/* 21 */     ☃.append('}');
/* 22 */     return ☃.toString();
/*    */   }
/*    */   
/*    */   private static String a(Field ☃) {
/* 26 */     SerializedName serializedName = ☃.<SerializedName>getAnnotation(SerializedName.class);
/* 27 */     return (serializedName != null) ? serializedName.value() : ☃.getName();
/*    */   }
/*    */   
/*    */   private static boolean b(Field ☃) {
/* 31 */     return Modifier.isStatic(☃.getModifiers());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */