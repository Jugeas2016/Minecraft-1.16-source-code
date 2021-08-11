/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collection;
/*     */ import java.util.function.Consumer;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lp
/*     */ {
/*  20 */   private final Collection<lf> a = Lists.newArrayList();
/*     */   
/*     */   @Nullable
/*  23 */   private Collection<lg> b = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public lp(Collection<lf> ☃) {
/*  29 */     this.a.addAll(☃);
/*     */   }
/*     */   
/*     */   public void a(lf ☃) {
/*  33 */     this.a.add(☃);
/*  34 */     this.b.forEach(☃::a);
/*     */   }
/*     */   
/*     */   public void a(lg ☃) {
/*  38 */     this.b.add(☃);
/*  39 */     this.a.forEach(lf1 -> lf1.a(☃));
/*     */   }
/*     */   
/*     */   public void a(Consumer<lf> ☃) {
/*  43 */     a(new lg(this, ☃)
/*     */         {
/*     */           public void a(lf ☃) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public void c(lf ☃) {
/*  55 */             this.a.accept(☃);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public int a() {
/*  61 */     return (int)this.a.stream().filter(lf::i).filter(lf::q).count();
/*     */   }
/*     */   
/*     */   public int b() {
/*  65 */     return (int)this.a.stream().filter(lf::i).filter(lf::r).count();
/*     */   }
/*     */   
/*     */   public int c() {
/*  69 */     return (int)this.a.stream().filter(lf::k).count();
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  73 */     return (a() > 0);
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  77 */     return (b() > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int h() {
/*  89 */     return this.a.size();
/*     */   }
/*     */   
/*     */   public boolean i() {
/*  93 */     return (c() == h());
/*     */   }
/*     */   
/*     */   public String j() {
/*  97 */     StringBuffer ☃ = new StringBuffer();
/*  98 */     ☃.append('[');
/*  99 */     this.a.forEach(lf1 -> {
/*     */           if (!lf1.j()) {
/*     */             ☃.append(' ');
/*     */           } else if (lf1.h()) {
/*     */             ☃.append('+');
/*     */           } else if (lf1.i()) {
/*     */             ☃.append(lf1.q() ? 88 : 120);
/*     */           } else {
/*     */             ☃.append('_');
/*     */           } 
/*     */         });
/* 110 */     ☃.append(']');
/* 111 */     return ☃.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 116 */     return j();
/*     */   }
/*     */   
/*     */   public lp() {}
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\lp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */