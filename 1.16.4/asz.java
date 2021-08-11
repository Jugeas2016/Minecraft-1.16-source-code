/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
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
/*     */ public class asz
/*     */   extends arv<aqu>
/*     */ {
/*     */   public asz() {
/*  37 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.i, aye.a, ayd.m, aye.b, ayd.n, aye.c, ayd.q, aye.c));
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
/*     */   
/*     */   protected boolean a(aag ☃, aqu aqu1) {
/*  50 */     return (☃.u_().nextInt(10) == 0 && e(aqu1));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, aqu aqu1, long l) {
/*  55 */     aqm aqm = b(aqu1);
/*  56 */     if (aqm != null) {
/*     */       
/*  58 */       a(☃, aqu1, aqm);
/*     */       
/*     */       return;
/*     */     } 
/*  62 */     Optional<aqm> optional = b(aqu1);
/*  63 */     if (optional.isPresent()) {
/*     */       
/*  65 */       a(aqu1, optional.get());
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  70 */     a(aqu1).ifPresent(aqm1 -> a(☃, aqm1));
/*     */   }
/*     */   
/*     */   private void a(aag ☃, aqu aqu1, aqm aqm1) {
/*  74 */     for (int i = 0; i < 10; i++) {
/*  75 */       dcn dcn = azj.b(aqu1, 20, 8);
/*  76 */       if (dcn != null && ☃.a_(new fx(dcn))) {
/*  77 */         aqu1.cJ().a(ayd.m, new ayf(dcn, 0.6F, 0));
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(aqu ☃, aqm aqm1) {
/*  84 */     arf<?> arf = ☃.cJ();
/*  85 */     arf.a(ayd.q, aqm1);
/*  86 */     arf.a(ayd.n, new asd(aqm1, true));
/*  87 */     arf.a(ayd.m, new ayf(new asd(aqm1, false), 0.6F, 1));
/*     */   }
/*     */   
/*     */   private Optional<aqm> a(aqu ☃) {
/*  91 */     return d(☃).stream().findAny();
/*     */   }
/*     */ 
/*     */   
/*     */   private Optional<aqm> b(aqu ☃) {
/*  96 */     Map<aqm, Integer> map = c(☃);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     return map.entrySet().stream()
/* 102 */       .sorted(Comparator.comparingInt(Map.Entry::getValue))
/* 103 */       .filter(☃ -> (((Integer)☃.getValue()).intValue() > 0 && ((Integer)☃.getValue()).intValue() <= 5))
/* 104 */       .map(Map.Entry::getKey)
/* 105 */       .findFirst();
/*     */   }
/*     */   
/*     */   private Map<aqm, Integer> c(aqu ☃) {
/* 109 */     Map<aqm, Integer> map = Maps.newHashMap();
/*     */     
/* 111 */     d(☃).stream()
/* 112 */       .filter(this::c)
/* 113 */       .forEach(aqm1 -> (Integer)☃.compute(a(aqm1), ()));
/*     */ 
/*     */ 
/*     */     
/* 117 */     return map;
/*     */   }
/*     */   
/*     */   private List<aqm> d(aqu ☃) {
/* 121 */     return ☃.cJ().<List<aqm>>c(ayd.i).get();
/*     */   }
/*     */   
/*     */   private aqm a(aqm ☃) {
/* 125 */     return ☃.cJ().<aqm>c(ayd.q).get();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private aqm b(aqm ☃) {
/* 130 */     return ((List<aqm>)☃.cJ().<List<aqm>>c(ayd.i).get()).stream()
/* 131 */       .filter(aqm1 -> a(☃, aqm1))
/* 132 */       .findAny()
/* 133 */       .orElse(null);
/*     */   }
/*     */   
/*     */   private boolean c(aqm ☃) {
/* 137 */     return ☃.cJ().<aqm>c(ayd.q).isPresent();
/*     */   }
/*     */   
/*     */   private boolean a(aqm ☃, aqm aqm1) {
/* 141 */     return aqm1.cJ().<aqm>c(ayd.q)
/* 142 */       .filter(aqm1 -> (aqm1 == ☃))
/* 143 */       .isPresent();
/*     */   }
/*     */   
/*     */   private boolean e(aqu ☃) {
/* 147 */     return ☃.cJ().a(ayd.i);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */