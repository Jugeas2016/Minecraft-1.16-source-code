/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSyntaxException;
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
/*    */ 
/*    */ 
/*    */ public class dbn
/*    */   implements dbo
/*    */ {
/*    */   private final buo a;
/*    */   private final cm b;
/*    */   
/*    */   private dbn(buo ☃, cm cm1) {
/* 25 */     this.a = ☃;
/* 26 */     this.b = cm1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 31 */     return dbq.h;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 36 */     return (Set<daz<?>>)ImmutableSet.of(dbc.g);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 41 */     ceh ceh = ☃.<ceh>c(dbc.g);
/* 42 */     return (ceh != null && this.a == ceh.b() && this.b.a(ceh));
/*    */   }
/*    */   
/*    */   public static class a implements dbo.a {
/*    */     private final buo a;
/* 47 */     private cm b = cm.a;
/*    */     
/*    */     public a(buo ☃) {
/* 50 */       this.a = ☃;
/*    */     }
/*    */     
/*    */     public a a(cm.a ☃) {
/* 54 */       this.b = ☃.b();
/* 55 */       return this;
/*    */     }
/*    */ 
/*    */     
/*    */     public dbo build() {
/* 60 */       return new dbn(this.a, this.b);
/*    */     }
/*    */   }
/*    */   
/*    */   public static a a(buo ☃) {
/* 65 */     return new a(☃);
/*    */   }
/*    */   
/*    */   public static class b
/*    */     implements cze<dbn> {
/*    */     public void a(JsonObject ☃, dbn dbn1, JsonSerializationContext jsonSerializationContext) {
/* 71 */       ☃.addProperty("block", gm.Q.b(dbn.a(dbn1)).toString());
/* 72 */       ☃.add("properties", dbn.b(dbn1).a());
/*    */     }
/*    */ 
/*    */     
/*    */     public dbn b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 77 */       vk vk = new vk(afd.h(☃, "block"));
/*    */       
/* 79 */       buo buo = (buo)gm.Q.b(vk).orElseThrow(() -> new IllegalArgumentException("Can't find block " + ☃));
/* 80 */       cm cm = cm.a(☃.get("properties"));
/* 81 */       cm.a(buo.m(), str -> {
/*    */             throw new JsonSyntaxException("Block " + ☃ + " has no property " + str);
/*    */           });
/*    */       
/* 85 */       return new dbn(buo, cm);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */