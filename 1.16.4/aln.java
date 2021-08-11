/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.Const;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import com.mojang.serialization.codecs.PrimitiveCodec;
/*    */ 
/*    */ public class aln
/*    */   extends Schema
/*    */ {
/*    */   public aln(int ☃, Schema schema) {
/* 14 */     super(☃, schema);
/*    */   }
/*    */   
/*    */   public static String a(String ☃) {
/* 18 */     vk vk = vk.a(☃);
/* 19 */     if (vk != null) {
/* 20 */       return vk.toString();
/*    */     }
/* 22 */     return ☃;
/*    */   }
/*    */   
/* 25 */   public static final PrimitiveCodec<String> a = new PrimitiveCodec<String>()
/*    */     {
/*    */       public <T> DataResult<String> read(DynamicOps<T> ☃, T t) {
/* 28 */         return ☃
/* 29 */           .getStringValue(t)
/* 30 */           .map(aln::a);
/*    */       }
/*    */ 
/*    */       
/*    */       public <T> T a(DynamicOps<T> ☃, String str) {
/* 35 */         return (T)☃.createString(str);
/*    */       }
/*    */ 
/*    */       
/*    */       public String toString() {
/* 40 */         return "NamespacedString";
/*    */       }
/*    */     };
/*    */   
/* 44 */   private static final Type<String> b = (Type<String>)new Const.PrimitiveType((Codec)a);
/*    */   
/*    */   public static Type<String> a() {
/* 47 */     return b;
/*    */   }
/*    */ 
/*    */   
/*    */   public Type<?> getChoiceType(DSL.TypeReference ☃, String str) {
/* 52 */     return super.getChoiceType(☃, a(str));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aln.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */