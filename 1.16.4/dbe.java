/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.List;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dbe
/*    */   implements dbo
/*    */ {
/*    */   private final dbo[] a;
/*    */   private final Predicate<cyv> b;
/*    */   
/*    */   private dbe(dbo[] ☃) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = dbq.b((Predicate<cyv>[])☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 26 */     return dbq.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public final boolean a(cyv ☃) {
/* 31 */     return this.b.test(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 36 */     super.a(☃);
/*    */     
/* 38 */     for (int i = 0; i < this.a.length; i++)
/* 39 */       this.a[i].a(☃.b(".term[" + i + "]")); 
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements dbo.a {
/* 44 */     private final List<dbo> a = Lists.newArrayList();
/*    */     
/*    */     public a(dbo.a... ☃) {
/* 47 */       for (dbo.a a1 : ☃) {
/* 48 */         this.a.add(a1.build());
/*    */       }
/*    */     }
/*    */ 
/*    */     
/*    */     public a a(dbo.a ☃) {
/* 54 */       this.a.add(☃.build());
/* 55 */       return this;
/*    */     }
/*    */ 
/*    */     
/*    */     public dbo build() {
/* 60 */       return new dbe(this.a.<dbo>toArray(new dbo[0]));
/*    */     }
/*    */   }
/*    */   
/*    */   public static a a(dbo.a... ☃) {
/* 65 */     return new a(☃);
/*    */   }
/*    */   
/*    */   public static class b
/*    */     implements cze<dbe> {
/*    */     public void a(JsonObject ☃, dbe dbe1, JsonSerializationContext jsonSerializationContext) {
/* 71 */       ☃.add("terms", jsonSerializationContext.serialize(dbe.a(dbe1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dbe b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 76 */       dbo[] arrayOfDbo = afd.<dbo[]>a(☃, "terms", jsonDeserializationContext, (Class)dbo[].class);
/* 77 */       return new dbe(arrayOfDbo);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */