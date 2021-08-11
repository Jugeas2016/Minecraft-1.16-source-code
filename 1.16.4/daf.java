/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.mojang.authlib.GameProfile;
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
/*    */ 
/*    */ 
/*    */ public class daf
/*    */   extends dai
/*    */ {
/*    */   private final cyv.c a;
/*    */   
/*    */   public daf(dbo[] ☃, cyv.c c1) {
/* 26 */     super(☃);
/* 27 */     this.a = c1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 32 */     return dal.t;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 37 */     return (Set<daz<?>>)ImmutableSet.of(this.a.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 42 */     if (☃.b() == bmd.pg) {
/* 43 */       aqa aqa = cyv1.<aqa>c((daz)this.a.a());
/* 44 */       if (aqa instanceof bfw) {
/* 45 */         GameProfile gameProfile = ((bfw)aqa).eA();
/* 46 */         ☃.p().a("SkullOwner", mp.a(new md(), gameProfile));
/*    */       } 
/*    */     } 
/* 49 */     return ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static class a
/*    */     extends dai.c<daf>
/*    */   {
/*    */     public void a(JsonObject ☃, daf daf1, JsonSerializationContext jsonSerializationContext) {
/* 59 */       super.a(☃, daf1, jsonSerializationContext);
/* 60 */       ☃.add("entity", jsonSerializationContext.serialize(daf.a(daf1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public daf a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 65 */       cyv.c c1 = afd.<cyv.c>a(☃, "entity", jsonDeserializationContext, cyv.c.class);
/* 66 */       return new daf(arrayOfDbo, c1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\daf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */