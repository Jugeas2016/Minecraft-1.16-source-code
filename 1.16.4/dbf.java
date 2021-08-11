/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dbf
/*    */   implements dbo
/*    */ {
/*    */   private final bps a;
/*    */   private final float[] b;
/*    */   
/*    */   private dbf(bps ☃, float[] arrayOfFloat) {
/* 26 */     this.a = ☃;
/* 27 */     this.b = arrayOfFloat;
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 32 */     return dbq.j;
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<daz<?>> a() {
/* 37 */     return (Set<daz<?>>)ImmutableSet.of(dbc.i);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cyv ☃) {
/* 42 */     bmb bmb = ☃.<bmb>c(dbc.i);
/*    */     
/* 44 */     int i = (bmb != null) ? bpu.a(this.a, bmb) : 0;
/* 45 */     float f = this.b[Math.min(i, this.b.length - 1)];
/* 46 */     return (☃.a().nextFloat() < f);
/*    */   }
/*    */   
/*    */   public static dbo.a a(bps ☃, float... arrayOfFloat) {
/* 50 */     return () -> new dbf(☃, arrayOfFloat);
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements cze<dbf> {
/*    */     public void a(JsonObject ☃, dbf dbf1, JsonSerializationContext jsonSerializationContext) {
/* 56 */       ☃.addProperty("enchantment", gm.R.b(dbf.a(dbf1)).toString());
/* 57 */       ☃.add("chances", jsonSerializationContext.serialize(dbf.b(dbf1)));
/*    */     }
/*    */ 
/*    */     
/*    */     public dbf b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 62 */       vk vk = new vk(afd.h(☃, "enchantment"));
/*    */       
/* 64 */       bps bps = (bps)gm.R.b(vk).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + ☃));
/* 65 */       float[] arrayOfFloat = afd.<float[]>a(☃, "chances", jsonDeserializationContext, (Class)float[].class);
/* 66 */       return new dbf(bps, arrayOfFloat);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */