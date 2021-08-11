/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
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
/*    */ public class dap
/*    */   extends dai
/*    */ {
/*    */   private final vk a;
/*    */   private final long b;
/*    */   
/*    */   private dap(dbo[] ☃, vk vk1, long l) {
/* 22 */     super(☃);
/* 23 */     this.a = vk1;
/* 24 */     this.b = l;
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 29 */     return dal.q;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 34 */     if (☃.a()) {
/* 35 */       return ☃;
/*    */     }
/*    */     
/* 38 */     md md = new md();
/* 39 */     md.a("LootTable", this.a.toString());
/* 40 */     if (this.b != 0L) {
/* 41 */       md.a("LootTableSeed", this.b);
/*    */     }
/* 43 */     ☃.p().a("BlockEntityTag", md);
/* 44 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 49 */     if (☃.a(this.a)) {
/* 50 */       ☃.a("Table " + this.a + " is recursively called");
/*    */       
/*    */       return;
/*    */     } 
/* 54 */     super.a(☃);
/*    */     
/* 56 */     cyy cyy = ☃.c(this.a);
/* 57 */     if (cyy == null) {
/* 58 */       ☃.a("Unknown loot table called " + this.a);
/*    */     } else {
/* 60 */       cyy.a(☃.a("->{" + this.a + "}", this.a));
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static class a
/*    */     extends dai.c<dap>
/*    */   {
/*    */     public void a(JsonObject ☃, dap dap1, JsonSerializationContext jsonSerializationContext) {
/* 75 */       super.a(☃, dap1, jsonSerializationContext);
/*    */       
/* 77 */       ☃.addProperty("name", dap.a(dap1).toString());
/* 78 */       if (dap.b(dap1) != 0L) {
/* 79 */         ☃.addProperty("seed", Long.valueOf(dap.b(dap1)));
/*    */       }
/*    */     }
/*    */ 
/*    */     
/*    */     public dap a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 85 */       vk vk = new vk(afd.h(☃, "name"));
/* 86 */       long l = afd.a(☃, "seed", 0L);
/* 87 */       return new dap(arrayOfDbo, vk, l);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */