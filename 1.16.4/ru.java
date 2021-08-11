/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ru
/*     */   implements oj<om>
/*     */ {
/*     */   private int a;
/*  19 */   private final List<a> b = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ru(int ☃, Collection<arh> collection) {
/*  25 */     this.a = ☃;
/*     */     
/*  27 */     for (arh arh : collection) {
/*  28 */       this.b.add(new a(this, arh.a(), arh.b(), arh.c()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  34 */     this.a = ☃.i();
/*     */     
/*  36 */     int i = ☃.readInt();
/*  37 */     for (int j = 0; j < i; j++) {
/*  38 */       vk vk = ☃.p();
/*  39 */       arg arg = gm.af.a(vk);
/*  40 */       double d = ☃.readDouble();
/*  41 */       List<arj> list = Lists.newArrayList();
/*  42 */       int k = ☃.i();
/*     */       
/*  44 */       for (int m = 0; m < k; m++) {
/*  45 */         UUID uUID = ☃.k();
/*  46 */         list.add(new arj(uUID, "Unknown synced attribute modifier", ☃.readDouble(), arj.a.a(☃.readByte())));
/*     */       } 
/*     */       
/*  49 */       this.b.add(new a(this, arg, d, list));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  55 */     ☃.d(this.a);
/*  56 */     ☃.writeInt(this.b.size());
/*     */     
/*  58 */     for (a a : this.b) {
/*  59 */       ☃.a(gm.af.b(a.a()));
/*  60 */       ☃.writeDouble(a.b());
/*  61 */       ☃.d(a.c().size());
/*     */       
/*  63 */       for (arj arj : a.c()) {
/*  64 */         ☃.a(arj.a());
/*  65 */         ☃.writeDouble(arj.d());
/*  66 */         ☃.writeByte(arj.c().a());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/*  73 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public int b() {
/*  77 */     return this.a;
/*     */   }
/*     */   
/*     */   public List<a> c() {
/*  81 */     return this.b;
/*     */   }
/*     */   
/*     */   public ru() {}
/*     */   
/*     */   public class a {
/*     */     private final arg b;
/*     */     
/*     */     public a(ru ☃, arg arg1, double d, Collection<arj> collection) {
/*  90 */       this.b = arg1;
/*  91 */       this.c = d;
/*  92 */       this.d = collection;
/*     */     }
/*     */     private final double c; private final Collection<arj> d;
/*     */     public arg a() {
/*  96 */       return this.b;
/*     */     }
/*     */     
/*     */     public double b() {
/* 100 */       return this.c;
/*     */     }
/*     */     
/*     */     public Collection<arj> c() {
/* 104 */       return this.d;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ru.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */