/*    */ import it.unimi.dsi.fastutil.shorts.ShortIterator;
/*    */ import it.unimi.dsi.fastutil.shorts.ShortSet;
/*    */ import java.io.IOException;
/*    */ import java.util.function.BiConsumer;
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
/*    */ public class qr
/*    */   implements oj<om>
/*    */ {
/*    */   private gp a;
/*    */   private short[] b;
/*    */   private ceh[] c;
/*    */   private boolean d;
/*    */   
/*    */   public qr() {}
/*    */   
/*    */   public qr(gp ☃, ShortSet shortSet, cgi cgi1, boolean bool) {
/* 27 */     this.a = ☃;
/* 28 */     this.d = bool;
/* 29 */     a(shortSet.size());
/*    */     
/* 31 */     int i = 0;
/* 32 */     for (ShortIterator<Short> shortIterator = shortSet.iterator(); shortIterator.hasNext(); ) { short s = ((Short)shortIterator.next()).shortValue();
/* 33 */       this.b[i] = s;
/* 34 */       this.c[i] = cgi1.a(gp.a(s), gp.b(s), gp.c(s));
/* 35 */       i++; }
/*    */   
/*    */   }
/*    */   
/*    */   private void a(int ☃) {
/* 40 */     this.b = new short[☃];
/* 41 */     this.c = new ceh[☃];
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 46 */     this.a = gp.a(☃.readLong());
/* 47 */     this.d = ☃.readBoolean();
/* 48 */     int i = ☃.i();
/* 49 */     a(i);
/*    */     
/* 51 */     for (int j = 0; j < this.b.length; j++) {
/* 52 */       long l = ☃.j();
/* 53 */       this.b[j] = (short)(int)(l & 0xFFFL);
/* 54 */       this.c[j] = buo.m.a((int)(l >>> 12L));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 60 */     ☃.writeLong(this.a.s());
/* 61 */     ☃.writeBoolean(this.d);
/* 62 */     ☃.d(this.b.length);
/*    */     
/* 64 */     for (int i = 0; i < this.b.length; i++) {
/* 65 */       ☃.b((buo.i(this.c[i]) << 12 | this.b[i]));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 71 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public void a(BiConsumer<fx, ceh> ☃) {
/* 75 */     fx.a a = new fx.a();
/* 76 */     for (int i = 0; i < this.b.length; i++) {
/* 77 */       short s = this.b[i];
/* 78 */       a.d(this.a.d(s), this.a.e(s), this.a.f(s));
/* 79 */       ☃.accept(a, this.c[i]);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 84 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */