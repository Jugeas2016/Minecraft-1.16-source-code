/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.List;
/*    */ import java.util.function.Predicate;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class czq
/*    */   implements czi
/*    */ {
/*    */   protected final dbo[] d;
/*    */   private final Predicate<cyv> c;
/*    */   
/*    */   protected czq(dbo[] ☃) {
/* 23 */     this.d = ☃;
/* 24 */     this.c = dbq.a((Predicate<cyv>[])☃);
/*    */   }
/*    */   
/*    */   public void a(czg ☃) {
/* 28 */     for (int i = 0; i < this.d.length; i++) {
/* 29 */       this.d[i].a(☃.b(".condition[" + i + "]"));
/*    */     }
/*    */   }
/*    */   
/*    */   protected final boolean a(cyv ☃) {
/* 34 */     return this.c.test(☃);
/*    */   }
/*    */   
/*    */   public abstract czr a();
/*    */   
/*    */   public static abstract class a<T extends a<T>> implements dbh<T> {
/* 40 */     private final List<dbo> a = Lists.newArrayList();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public T a(dbo.a ☃) {
/* 46 */       this.a.add(☃.build());
/* 47 */       return d();
/*    */     }
/*    */ 
/*    */     
/*    */     public final T e() {
/* 52 */       return d();
/*    */     }
/*    */     
/*    */     protected dbo[] f() {
/* 56 */       return this.a.<dbo>toArray(new dbo[0]);
/*    */     }
/*    */     
/*    */     public czh.a a(a<?> ☃) {
/* 60 */       return new czh.a((a<?>[])new a[] { this, ☃ });
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     protected abstract T d();
/*    */ 
/*    */ 
/*    */     
/*    */     public abstract czq b();
/*    */   }
/*    */ 
/*    */   
/*    */   public static abstract class b<T extends czq>
/*    */     implements cze<T>
/*    */   {
/*    */     public final void b(JsonObject ☃, T t, JsonSerializationContext jsonSerializationContext) {
/* 77 */       if (!ArrayUtils.isEmpty((Object[])((czq)t).d)) {
/* 78 */         ☃.add("conditions", jsonSerializationContext.serialize(((czq)t).d));
/*    */       }
/* 80 */       a(☃, t, jsonSerializationContext);
/*    */     }
/*    */ 
/*    */     
/*    */     public final T b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 85 */       dbo[] arrayOfDbo = afd.<dbo[]>a(☃, "conditions", new dbo[0], jsonDeserializationContext, (Class)dbo[].class);
/* 86 */       return b(☃, jsonDeserializationContext, arrayOfDbo);
/*    */     }
/*    */     
/*    */     public abstract void a(JsonObject param1JsonObject, T param1T, JsonSerializationContext param1JsonSerializationContext);
/*    */     
/*    */     public abstract T b(JsonObject param1JsonObject, JsonDeserializationContext param1JsonDeserializationContext, dbo[] param1ArrayOfdbo);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */