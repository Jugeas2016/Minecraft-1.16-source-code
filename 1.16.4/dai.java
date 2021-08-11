/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.List;
/*    */ import java.util.function.Function;
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
/*    */ 
/*    */ public abstract class dai
/*    */   implements daj
/*    */ {
/*    */   protected final dbo[] c;
/*    */   private final Predicate<cyv> a;
/*    */   
/*    */   protected dai(dbo[] ☃) {
/* 25 */     this.c = ☃;
/* 26 */     this.a = dbq.a((Predicate<cyv>[])☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public final bmb b(bmb ☃, cyv cyv1) {
/* 31 */     return this.a.test(cyv1) ? a(☃, cyv1) : ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 38 */     super.a(☃);
/*    */     
/* 40 */     for (int i = 0; i < this.c.length; i++)
/* 41 */       this.c[i].a(☃.b(".conditions[" + i + "]")); 
/*    */   }
/*    */   
/*    */   public static abstract class a<T extends a<T>>
/*    */     implements daj.a, dbh<T> {
/* 46 */     private final List<dbo> a = Lists.newArrayList();
/*    */ 
/*    */     
/*    */     public T a(dbo.a ☃) {
/* 50 */       this.a.add(☃.build());
/* 51 */       return d();
/*    */     }
/*    */ 
/*    */     
/*    */     public final T f() {
/* 56 */       return d();
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     protected dbo[] g() {
/* 62 */       return this.a.<dbo>toArray(new dbo[0]);
/*    */     }
/*    */     
/*    */     protected abstract T d();
/*    */   }
/*    */   
/*    */   static final class b extends a<b> {
/*    */     public b(Function<dbo[], daj> ☃) {
/* 70 */       this.a = ☃;
/*    */     }
/*    */     private final Function<dbo[], daj> a;
/*    */     
/*    */     protected b a() {
/* 75 */       return this;
/*    */     }
/*    */ 
/*    */     
/*    */     public daj b() {
/* 80 */       return this.a.apply(g());
/*    */     }
/*    */   }
/*    */   
/*    */   protected static a<?> a(Function<dbo[], daj> ☃) {
/* 85 */     return new b(☃);
/*    */   }
/*    */   
/*    */   protected abstract bmb a(bmb parambmb, cyv paramcyv);
/*    */   
/*    */   public static abstract class c<T extends dai> implements cze<T> { public void a(JsonObject ☃, T t, JsonSerializationContext jsonSerializationContext) {
/* 91 */       if (!ArrayUtils.isEmpty((Object[])((dai)t).c)) {
/* 92 */         ☃.add("conditions", jsonSerializationContext.serialize(((dai)t).c));
/*    */       }
/*    */     }
/*    */ 
/*    */     
/*    */     public final T b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 98 */       dbo[] arrayOfDbo = afd.<dbo[]>a(☃, "conditions", new dbo[0], jsonDeserializationContext, (Class)dbo[].class);
/* 99 */       return b(☃, jsonDeserializationContext, arrayOfDbo);
/*    */     }
/*    */     
/*    */     public abstract T b(JsonObject param1JsonObject, JsonDeserializationContext param1JsonDeserializationContext, dbo[] param1ArrayOfdbo); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */