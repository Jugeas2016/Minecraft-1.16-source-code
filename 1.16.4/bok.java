/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bok
/*    */   extends boj
/*    */ {
/* 13 */   private static final bon a = bon.a(new brw[] { bmd.mb });
/* 14 */   private static final bon b = bon.a(new brw[] { bmd.kU });
/* 15 */   private static final bon c = bon.a(new brw[] { bmd.pp });
/*    */   
/*    */   public bok(vk ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bio ☃, brx brx1) {
/* 23 */     boolean bool = false;
/* 24 */     int i = 0;
/*    */     
/* 26 */     for (int j = 0; j < ☃.Z_(); j++) {
/* 27 */       bmb bmb = ☃.a(j);
/* 28 */       if (!bmb.a())
/*    */       {
/*    */ 
/*    */         
/* 32 */         if (a.a(bmb)) {
/* 33 */           if (bool) {
/* 34 */             return false;
/*    */           }
/* 36 */           bool = true;
/* 37 */         } else if (b.a(bmb)) {
/* 38 */           i++;
/* 39 */           if (i > 3) {
/* 40 */             return false;
/*    */           }
/* 42 */         } else if (!c.a(bmb)) {
/* 43 */           return false;
/*    */         } 
/*    */       }
/*    */     } 
/* 47 */     return (bool && i >= 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bio ☃) {
/* 52 */     bmb bmb = new bmb(bmd.po, 3);
/* 53 */     md md = bmb.a("Fireworks");
/* 54 */     mj mj = new mj();
/*    */     
/* 56 */     int i = 0;
/*    */     
/* 58 */     for (int j = 0; j < ☃.Z_(); j++) {
/* 59 */       bmb bmb1 = ☃.a(j);
/* 60 */       if (!bmb1.a())
/*    */       {
/*    */ 
/*    */         
/* 64 */         if (b.a(bmb1)) {
/* 65 */           i++;
/* 66 */         } else if (c.a(bmb1)) {
/* 67 */           md md1 = bmb1.b("Explosion");
/* 68 */           if (md1 != null) {
/* 69 */             mj.add(md1);
/*    */           }
/*    */         } 
/*    */       }
/*    */     } 
/* 74 */     md.a("Flight", (byte)i);
/* 75 */     if (!mj.isEmpty()) {
/* 76 */       md.a("Explosions", mj);
/*    */     }
/*    */     
/* 79 */     return bmb;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i) {
/* 84 */     return (☃ * i >= 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb c() {
/* 89 */     return new bmb(bmd.po);
/*    */   }
/*    */ 
/*    */   
/*    */   public bos<?> ag_() {
/* 94 */     return bos.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bok.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */