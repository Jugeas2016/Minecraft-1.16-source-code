/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class czj
/*    */   extends czq
/*    */ {
/*    */   protected final czq[] c;
/*    */   private final czi e;
/*    */   
/*    */   protected czj(czq[] ☃, dbo[] arrayOfDbo) {
/* 18 */     super(arrayOfDbo);
/* 19 */     this.c = ☃;
/* 20 */     this.e = a((czi[])☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 25 */     super.a(☃);
/*    */     
/* 27 */     if (this.c.length == 0) {
/* 28 */       ☃.a("Empty children list");
/*    */     }
/*    */     
/* 31 */     for (int i = 0; i < this.c.length; i++) {
/* 32 */       this.c[i].a(☃.b(".entry[" + i + "]"));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected abstract czi a(czi[] paramArrayOfczi);
/*    */   
/*    */   public final boolean expand(cyv ☃, Consumer<czp> consumer) {
/* 40 */     if (!a(☃)) {
/* 41 */       return false;
/*    */     }
/*    */     
/* 44 */     return this.e.expand(☃, consumer);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static <T extends czj> czq.b<T> a(a<T> ☃) {
/* 53 */     return new czq.b<T>(☃)
/*    */       {
/*    */         public void a(JsonObject ☃, T t, JsonSerializationContext jsonSerializationContext) {
/* 56 */           ☃.add("children", jsonSerializationContext.serialize(((czj)t).c));
/*    */         }
/*    */ 
/*    */         
/*    */         public final T a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 61 */           czq[] arrayOfCzq = afd.<czq[]>a(☃, "children", jsonDeserializationContext, (Class)czq[].class);
/* 62 */           return (T)this.a.create(arrayOfCzq, arrayOfDbo);
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   @FunctionalInterface
/*    */   public static interface a<T extends czj> {
/*    */     T create(czq[] param1ArrayOfczq, dbo[] param1ArrayOfdbo);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */