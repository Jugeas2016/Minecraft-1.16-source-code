/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
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
/*    */ public class boz<T extends boc>
/*    */   implements bos<T>
/*    */ {
/*    */   private final int v;
/*    */   private final a<T> w;
/*    */   
/*    */   public boz(a<T> ☃, int i) {
/* 20 */     this.v = i;
/* 21 */     this.w = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public T b(vk ☃, JsonObject jsonObject) {
/* 26 */     String str1 = afd.a(jsonObject, "group", "");
/*    */     
/* 28 */     JsonElement jsonElement = afd.d(jsonObject, "ingredient") ? (JsonElement)afd.u(jsonObject, "ingredient") : (JsonElement)afd.t(jsonObject, "ingredient");
/* 29 */     bon bon = bon.a(jsonElement);
/*    */     
/* 31 */     String str2 = afd.h(jsonObject, "result");
/* 32 */     vk vk1 = new vk(str2);
/* 33 */     bmb bmb = new bmb((brw)gm.T.b(vk1).orElseThrow(() -> new IllegalStateException("Item: " + ☃ + " does not exist")));
/* 34 */     float f = afd.a(jsonObject, "experience", 0.0F);
/* 35 */     int i = afd.a(jsonObject, "cookingtime", this.v);
/*    */     
/* 37 */     return this.w.create(☃, str1, bon, bmb, f, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public T b(vk ☃, nf nf1) {
/* 42 */     String str = nf1.e(32767);
/* 43 */     bon bon = bon.b(nf1);
/* 44 */     bmb bmb = nf1.n();
/* 45 */     float f = nf1.readFloat();
/* 46 */     int i = nf1.i();
/* 47 */     return this.w.create(☃, str, bon, bmb, f, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃, T t) {
/* 52 */     ☃.a(((boc)t).c);
/* 53 */     ((boc)t).d.a(☃);
/* 54 */     ☃.a(((boc)t).e);
/* 55 */     ☃.writeFloat(((boc)t).f);
/* 56 */     ☃.d(((boc)t).g);
/*    */   }
/*    */   
/*    */   static interface a<T extends boc> {
/*    */     T create(vk param1vk, String param1String, bon param1bon, bmb param1bmb, float param1Float, int param1Int);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\boz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */