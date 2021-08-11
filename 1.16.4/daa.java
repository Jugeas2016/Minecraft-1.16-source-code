/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class daa
/*    */   extends dai
/*    */ {
/*    */   private final a a;
/*    */   
/*    */   private daa(dbo[] ☃, a a1) {
/* 21 */     super(☃);
/* 22 */     this.a = a1;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public dak b() {
/* 28 */     return dal.m;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 33 */     return (Set<daz<?>>)ImmutableSet.of(this.a.f);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 38 */     Object object = cyv1.c(this.a.f);
/* 39 */     if (object instanceof aoy) {
/* 40 */       aoy aoy = (aoy)object;
/* 41 */       if (aoy.S()) {
/* 42 */         ☃.a(aoy.d());
/*    */       }
/*    */     } 
/* 45 */     return ☃;
/*    */   }
/*    */   
/*    */   public static dai.a<?> a(a ☃) {
/* 49 */     return a(arrayOfDbo -> new daa(arrayOfDbo, ☃));
/*    */   }
/*    */   
/*    */   public enum a {
/* 53 */     a("this", dbc.a),
/* 54 */     b("killer", dbc.d),
/* 55 */     c("killer_player", dbc.b),
/* 56 */     d("block_entity", dbc.h);
/*    */     
/*    */     public final String e;
/*    */     public final daz<?> f;
/*    */     
/*    */     a(String ☃, daz<?> daz1) {
/* 62 */       this.e = ☃;
/* 63 */       this.f = daz1;
/*    */     }
/*    */     
/*    */     public static a a(String ☃) {
/* 67 */       for (a a1 : values()) {
/* 68 */         if (a1.e.equals(☃)) {
/* 69 */           return a1;
/*    */         }
/*    */       } 
/* 72 */       throw new IllegalArgumentException("Invalid name source " + ☃);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class b
/*    */     extends dai.c<daa> {
/*    */     public void a(JsonObject ☃, daa daa1, JsonSerializationContext jsonSerializationContext) {
/* 79 */       super.a(☃, daa1, jsonSerializationContext);
/*    */       
/* 81 */       ☃.addProperty("source", (daa.a(daa1)).e);
/*    */     }
/*    */ 
/*    */     
/*    */     public daa a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 86 */       daa.a a = daa.a.a(afd.h(☃, "source"));
/* 87 */       return new daa(arrayOfDbo, a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\daa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */