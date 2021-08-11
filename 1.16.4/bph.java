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
/*    */ public class bph
/*    */   implements boq<aon>
/*    */ {
/*    */   private final bon a;
/*    */   private final bon b;
/*    */   private final bmb c;
/*    */   private final vk d;
/*    */   
/*    */   public bph(vk ☃, bon bon1, bon bon2, bmb bmb1) {
/* 20 */     this.d = ☃;
/* 21 */     this.a = bon1;
/* 22 */     this.b = bon2;
/* 23 */     this.c = bmb1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(aon ☃, brx brx1) {
/* 28 */     return (this.a.a(☃.a(0)) && this.b.a(☃.a(1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(aon ☃) {
/* 33 */     bmb bmb1 = this.c.i();
/* 34 */     md md = ☃.a(0).o();
/* 35 */     if (md != null) {
/* 36 */       bmb1.c(md.g());
/*    */     }
/* 38 */     return bmb1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i) {
/* 43 */     return (☃ * i >= 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb c() {
/* 48 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean a(bmb ☃) {
/* 52 */     return this.b.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb h() {
/* 57 */     return new bmb(bup.lZ);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk f() {
/* 62 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 67 */     return bos.u;
/*    */   }
/*    */ 
/*    */   
/*    */   public bot<?> g() {
/* 72 */     return bot.g;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements bos<bph> {
/*    */     public bph b(vk ☃, JsonObject jsonObject) {
/* 78 */       bon bon1 = bon.a((JsonElement)afd.t(jsonObject, "base"));
/* 79 */       bon bon2 = bon.a((JsonElement)afd.t(jsonObject, "addition"));
/* 80 */       bmb bmb = bov.a(afd.t(jsonObject, "result"));
/* 81 */       return new bph(☃, bon1, bon2, bmb);
/*    */     }
/*    */ 
/*    */     
/*    */     public bph b(vk ☃, nf nf1) {
/* 86 */       bon bon1 = bon.b(nf1);
/* 87 */       bon bon2 = bon.b(nf1);
/* 88 */       bmb bmb = nf1.n();
/* 89 */       return new bph(☃, bon1, bon2, bmb);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(nf ☃, bph bph1) {
/* 94 */       bph.a(bph1).a(☃);
/* 95 */       bph.b(bph1).a(☃);
/* 96 */       ☃.a(bph.c(bph1));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */