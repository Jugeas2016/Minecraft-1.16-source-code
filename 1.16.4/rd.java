/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rd
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private final List<Pair<aqf, bmb>> b;
/*    */   
/*    */   public rd() {
/* 19 */     this.b = Lists.newArrayList();
/*    */   }
/*    */   
/*    */   public rd(int ☃, List<Pair<aqf, bmb>> list) {
/* 23 */     this.a = ☃;
/* 24 */     this.b = list;
/*    */   }
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/*    */     int i;
/* 29 */     this.a = ☃.i();
/* 30 */     aqf[] arrayOfAqf = aqf.values();
/*    */     
/*    */     do {
/* 33 */       i = ☃.readByte();
/* 34 */       aqf aqf = arrayOfAqf[i & 0x7F];
/* 35 */       bmb bmb = ☃.n();
/* 36 */       this.b.add(Pair.of(aqf, bmb));
/* 37 */     } while ((i & 0xFFFFFF80) != 0);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 45 */     ☃.d(this.a);
/*    */     
/* 47 */     int i = this.b.size();
/* 48 */     for (int j = 0; j < i; j++) {
/* 49 */       Pair<aqf, bmb> pair = this.b.get(j);
/* 50 */       aqf aqf = (aqf)pair.getFirst();
/* 51 */       boolean bool = (j != i - 1);
/* 52 */       int k = aqf.ordinal();
/* 53 */       ☃.writeByte(bool ? (k | 0xFFFFFF80) : k);
/* 54 */       ☃.a((bmb)pair.getSecond());
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 60 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 64 */     return this.a;
/*    */   }
/*    */   
/*    */   public List<Pair<aqf, bmb>> c() {
/* 68 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */