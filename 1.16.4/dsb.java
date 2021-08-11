/*    */ import com.google.common.base.Strings;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import java.util.UUID;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dsb
/*    */   extends dlo<drz>
/*    */ {
/*    */   private final dsc a;
/*    */   private final djz o;
/* 21 */   private final List<drz> p = Lists.newArrayList();
/*    */   
/*    */   @Nullable
/*    */   private String q;
/*    */   
/*    */   public dsb(dsc ☃, djz djz1, int i, int j, int k, int m, int n) {
/* 27 */     super(djz1, i, j, k, m, n);
/* 28 */     this.a = ☃;
/* 29 */     this.o = djz1;
/*    */     
/* 31 */     b(false);
/* 32 */     c(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 37 */     double d = this.o.aD().s();
/* 38 */     RenderSystem.enableScissor(
/* 39 */         (int)(q() * d), (int)((this.e - this.j) * d), 
/* 40 */         (int)((e() + 6) * d), (int)((this.e - this.e - this.j - this.i - 4) * d));
/*    */     
/* 42 */     super.a(☃, i, j, f);
/*    */     
/* 44 */     RenderSystem.disableScissor();
/*    */   }
/*    */   
/*    */   public void a(Collection<UUID> ☃, double d) {
/* 48 */     this.p.clear();
/* 49 */     for (UUID uUID : ☃) {
/* 50 */       dwx dwx = this.o.s.e.a(uUID);
/* 51 */       if (dwx != null) {
/* 52 */         this.p.add(new drz(this.o, this.a, dwx.a().getId(), dwx.a().getName(), dwx::g));
/*    */       }
/*    */     } 
/* 55 */     g();
/* 56 */     this.p.sort((☃, drz1) -> ☃.b().compareToIgnoreCase(drz1.b()));
/* 57 */     a(this.p);
/* 58 */     a(d);
/*    */   }
/*    */   
/*    */   private void g() {
/* 62 */     if (this.q != null) {
/* 63 */       this.p.removeIf(☃ -> !☃.b().toLowerCase(Locale.ROOT).contains(this.q));
/* 64 */       a(this.p);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a(String ☃) {
/* 69 */     this.q = ☃;
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 73 */     return this.p.isEmpty();
/*    */   }
/*    */   
/*    */   public void a(dwx ☃, dsc.a a1) {
/* 77 */     UUID uUID = ☃.a().getId();
/* 78 */     for (drz drz : this.p) {
/* 79 */       if (drz.c().equals(uUID)) {
/* 80 */         drz.c(false);
/*    */         return;
/*    */       } 
/*    */     } 
/* 84 */     if ((a1 == dsc.a.a || this.o.aB().c(uUID)) && (
/* 85 */       Strings.isNullOrEmpty(this.q) || ☃.a().getName().toLowerCase(Locale.ROOT).contains(this.q))) {
/* 86 */       drz drz = new drz(this.o, this.a, ☃.a().getId(), ☃.a().getName(), ☃::g);
/* 87 */       b(drz);
/* 88 */       this.p.add(drz);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(UUID ☃) {
/* 94 */     for (drz drz : this.p) {
/* 95 */       if (drz.c().equals(☃)) {
/* 96 */         drz.c(true);
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */